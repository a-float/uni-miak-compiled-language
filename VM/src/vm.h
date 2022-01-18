#pragma once

class VM {
    int *code;      // array od byte codes to be executed
    int *stack;     // virtual stack
    int pc;         // program counter (aka. IP - instruction pointer)
    int sp;         // stack pointer
    int fp;         // frame pointer (for local scope)
    int stackSize;
    bool debug;

    inline void push(int value);

    inline int pop();

    int nextCode(bool show);

    void printStack();


public:
    VM(int *_code, int _pc, int _stackSize, bool _debug);

    ~VM();

    int run();
};