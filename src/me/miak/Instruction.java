package me.miak;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Instruction {
    public static Map<String, Integer> map = new HashMap<>();
    public Opcode opcode = null;
    public Integer immVal = null;
    public String label = null;
    private static final Random random = new Random();


    public static String getLabelName(String prefix){
        int i = random.nextInt(9999);
        String label = prefix + i;
        while(map.containsKey(label)){
            i++;
            label = prefix + i;
        }
        return label;
    }

    public Instruction(Opcode opcode) {
        this.opcode = opcode;
    }

    public Instruction(int immVal) {
        this.immVal = immVal;
    }

    public Instruction(String label) {
        this.label = label;
    }

    public int resolve() {
        if (opcode != null) {
            return opcode.getCode();
        } else if (immVal != null) {
            return immVal;
        } else if (label != null) {
            return map.get(label);
        } else throw new RuntimeException("Invalid Instruction state");
    }
}

