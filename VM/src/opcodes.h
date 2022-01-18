#pragma once

#include <map>
#include <string>
#include <tr1/cstdint>

enum {
    ADD_I32 = 1,
    SUB_I32,
    MUL_I32,
    DIV_I32,
    POW,
    LT_I32,
    LTE_I32,
    NOT,
    EQ_I32,
    JMP = 10,
    JMPT,
    JMPF,
    CONST_I32,
    LOAD,
    SGLOAD,
    STORE,
    SGSTORE,
    PRINT,
    POPN = 19,
    RET,
    SCALL,
    SLOAD,
    SSTORE,
    FILLZ,
    VRET,
    HALT = 26
};

const std::map<std::string, int32_t> nameToOpcode = {
        {"ADD_I32",   ADD_I32},
        {"SUB_I32",   SUB_I32},
        {"MUL_I32",   MUL_I32},
        {"DIV_I32",   DIV_I32},
        {"POW",       POW},
        {"LT_I32",    LT_I32},
        {"LTE_I32",   LTE_I32},
        {"NOT",       NOT},
        {"EQ_I32",    EQ_I32},
        {"JMP",       JMP},
        {"JMPT",      JMPT},
        {"JMPF",      JMPF},
        {"CONST_I32", CONST_I32},
        {"LOAD",      LOAD},
        {"SGLOAD",     SGLOAD},
        {"STORE",     STORE},
        {"SGSTORE",    SGSTORE},
        {"PRINT",     PRINT},
        {"POPN",      POPN},
        {"RET",       RET},
        {"SCALL",     SCALL},
        {"SLOAD",     SLOAD},
        {"SSTORE",     SSTORE},
        {"FILLZ",     FILLZ},
        {"VRET",     VRET},
        {"HALT",      HALT},
};

const std::map<int32_t, std::string> opcodeToName = {
        {ADD_I32,   "ADD_I32"},
        {SUB_I32,   "SUB_I32"},
        {MUL_I32,   "MUL_I32"},
        {DIV_I32,   "DIV_I32"},
        {POW,       "POW"},
        {LT_I32,    "LT_I32"},
        {LTE_I32,   "LTE_I32"},
        {NOT,       "NOT"},
        {EQ_I32,    "EQ_I32"},
        {JMP,       "JMP"},
        {JMPT,      "JMPT"},
        {JMPF,      "JMPF"},
        {CONST_I32, "CONST_I32"},
        {LOAD,      "LOAD"},
        {SGLOAD,     "SGLOAD"},
        {STORE,     "STORE"},
        {SGSTORE,    "SGSTORE"},
        {PRINT,     "PRINT"},
        {POPN,       "POPN"},
        {RET,       "RET"},
        {SCALL,     "SCALL"},
        {SLOAD,     "SLOAD"},
        {SSTORE,     "SSTORE"},
        {FILLZ,     "FILLZ"},
        {VRET,     "VRET"},
        {HALT,      "HALT"},
};

const std::map<uint32_t, int> opcodeToArgCount = {
        {ADD_I32,   0},
        {SUB_I32,   0},
        {MUL_I32,   0},
        {DIV_I32,   0},
        {POW,       0},
        {LT_I32,    0},
        {LTE_I32,   0},
        {NOT,       0},
        {EQ_I32,    0},
        {JMP,       1},
        {JMPT,      1},
        {JMPF,      1},
        {CONST_I32, 1},
        {LOAD,      1},
        {SGLOAD,     0},
        {STORE,     1},
        {SGSTORE,    0},
        {PRINT,     0},
        {POPN,      1},
        {RET,       0},
        {SCALL,     1},
        {SLOAD,     0},
        {SSTORE,    0},
        {FILLZ,     1},
        {VRET,      0},
        {HALT,      0},
};