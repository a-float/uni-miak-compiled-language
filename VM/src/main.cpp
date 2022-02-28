#include "vm.h"
#include "opcodes.h"
#include <fstream>
#include <vector>
#include <cstring>

std::vector<int32_t> program;

int read_program_from_file(std::vector<int32_t> &vec, char *filename) {
    std::ifstream file(filename, std::ios::binary);
    if (file.fail()) {
        printf("Could not open the file %s\n", filename);
        return 1;
    }
    int32_t code;
    while (true) {
        file.read(reinterpret_cast<char *>(&code), sizeof(code));
        program.push_back(code);
        if (file && file.peek() == EOF)break;
    }
    file.close();
    return 0;
}

int main(int argc, char **argv) {
    if (argc < 3) {
        printf("Usage: %s [--debug]? [.cexe file] [stack size]", argv[0]);
        return 0;
    }
    bool debug = strcmp(argv[1], "--debug") == 0;
    if (argc < 4 && debug) {
        printf("Usage: %s [--debug]? [.cexe file] [stack size]", argv[0]);
        return 0;
    }

    int argStart = debug ? 2 : 1;
    int status = read_program_from_file(program, argv[argStart]);
    if (status == 1) {
        return 1;
    }
    VM *vm = new VM(&program[1],
                    program.front(),    // start of the program is the first code of the executable
                    std::stoi(argv[argStart + 1]),
                    debug);
    int returnStatus = vm->run();
    delete vm;
    return returnStatus;
}