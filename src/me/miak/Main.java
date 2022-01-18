package me.miak;

import me.miak.parser.CoolangLexer;
import me.miak.parser.CoolangParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) throws IOException {
        String file = args.length == 1 ? args[0] : "./resources/main.cool";
        String input = args.length == 2 ? args[1] : null;
        CharStream inputStream;
        if (input == null) {
            inputStream = CharStreams.fromFileName(file);
        } else {
            inputStream = CharStreams.fromString(input);
        }
        List<Instruction> comms = new ArrayList<>();

        if (runParser(inputStream, comms)) {
            String result = comms.stream().map(i -> Integer.toString(i.resolve())).collect(Collectors.joining(","));
            System.out.println(result);
            OutputStream outputStream = new BufferedOutputStream(new FileOutputStream("out.cexe"));
            ByteBuffer buffer = ByteBuffer.allocate(comms.size()*4);
            buffer.order(ByteOrder.LITTLE_ENDIAN);
            for(Instruction comm : comms){
                buffer.putInt(comm.resolve());
            }
            outputStream.write(buffer.array());
            outputStream.close();
            System.out.println("Compiled program saved to out.cexe");
        } else {
            System.out.println("Compilation failed");
        }
    }

    public static boolean runParser(CharStream inputStream, List<Instruction> comms) {
        List<String> errors = new ArrayList<>();
        CoolangLexer lexer = new CoolangLexer(inputStream);
        CoolangParser parser = new CoolangParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(new MyErrorListener(errors));

        ParseTree tree = parser.parse();
        if (errors.size() > 0) {
            System.out.println("Found " + errors.size() + " errors while parsing:");
            errors.forEach(System.out::println);
            return false;
        }
        MyVisitor visitor = new MyVisitor(comms, errors);
        visitor.visit(tree);
        if (errors.size() > 0) {
            System.out.println("Found " + errors.size() + " error" + (errors.size() != 1 ? "s" : "") + " while compiling:");
            errors.forEach(System.out::println);
            return false;
        }
        return true;
    }
}