#include <fstream>
#include <iostream>
#include <string>
#include <cstring>
#include <iomanip>
#include "opcodes.h"

using namespace std;

int translateComm(string &comm, ofstream *out, bool *isFirstLine) {
    char *endptr;
    if (*isFirstLine) {
        int32_t firstInstruction = std::strtol(&comm[0], &endptr, 10);
        if (*endptr != '\0') {
            throw std::invalid_argument("Invalid start instruction number: '" + comm + "'");
        }
        out->write(reinterpret_cast<const char *>(&firstInstruction), sizeof(firstInstruction));
        *isFirstLine = false;
        return 0;
    }
    if (nameToOpcode.count(comm) == 1) {
        int32_t opcode = nameToOpcode.at(comm);
        out->write(reinterpret_cast<const char *>(&opcode), sizeof(opcode));
    } else {
        int32_t value;
        try {
            value = std::strtol(&comm[0], &endptr, 10);
            if (*endptr != '\0') {
                throw std::invalid_argument("Invalid instruction");
            }
        }
        catch (const std::invalid_argument &ia) {
            cout << "Invalid instruction \"" << comm << "\"" << endl;
            return 0;
        }
        out->write(reinterpret_cast<const char *>(&value), sizeof(value));
    }
    return 0;
}

string getOutFilename(const char *filename) {
    string name = string(filename);
    size_t found = name.find_last_of('.');
    string baseName = name.substr(0, found);
    baseName.append(".cexe");
    return baseName;
}

void assemble(char *filename) {
    ifstream inFile(filename);
    if (inFile.fail()) {
        cout << "Could not open file \"" << filename << "\"." << endl;
        inFile.close();
        return;
    }
    string outFilename = getOutFilename(filename);
    ofstream outFile(outFilename, ios::trunc | ios::binary);
    if (outFile.fail()) {
        cout << "Could not create output file \"" << outFilename << "\"." << endl;
        inFile.close();
        outFile.close();
        return;
    }
    string line;
    string comm;
    bool isFirstLine = true;
    while (getline(inFile, line)) {
        for (int i = 0; i < line.size(); i++) {
            if (isspace(line[i]) && comm.empty()) {
                continue;
            } else if (i > 0 && line[i - 1] == '/' && line[i] == '/') {
                comm.clear();
                break;
            } else if (line[i] == ',' || (isspace(line[i]) && !comm.empty())) {
                translateComm(comm, &outFile, &isFirstLine);
                comm.clear();
            } else comm.append(1, line[i]);
        }
        if (!comm.empty()) {
            translateComm(comm, &outFile, &isFirstLine);
            comm.clear();
        }
    }
    outFile.close();
    cout << "Binary saved to " + outFilename << endl;
    inFile.close();
}

void deassemble(char *filename) {
    ifstream inFile(filename, std::ios::binary);
    if (inFile.fail()) {
        cout << "Could not open file \"" << filename << "\"." << endl;
        inFile.close();
        return;
    }
    int32_t code;
    int lineNum = 0, thisLineNum;
    int argCount;
    string line;
    bool isFirstLine = true;
    while (true) {
        inFile.read(reinterpret_cast<char *>(&code), sizeof(code));
        if (isFirstLine) {
            cout << left << setw(20) << code << "// starting instruction" << endl;
            isFirstLine = false;
            continue;
        }
        if (code < 1 || code > HALT) {
            cout << "Invalid opcode :" << code << endl << "Aborting" << endl;
            inFile.close();
            return;
        }
        argCount = opcodeToArgCount.at(code);
        line.append(opcodeToName.at(code) + ", ");
        thisLineNum = lineNum;
        lineNum += argCount + 1;
        while (argCount != 0) {
            inFile.read(reinterpret_cast<char *>(&code), sizeof(code));
            line.append(to_string(code) + ", ");
            argCount--;
        }

        cout << left << setw(20) << line << "// " << thisLineNum << endl;
        line.clear();
        if (inFile && inFile.peek() == EOF) {
            break;
        }
    }
    inFile.close();
}

int main(int argc, char **argv) {
    if (argc < 2) {
        cout << "Invalid usage. Pass one or more files to assemble.";
        return 0;
    }
    if (strcmp(argv[1], "-d") == 0) {
        for (int i = 2; i < argc; i++) {
            deassemble(argv[i]);
        }
    } else {
        for (int i = 1; i < argc; i++) {
            assemble(argv[i]);
        }
    }
}