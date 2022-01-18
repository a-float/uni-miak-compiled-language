#include "vm.h"
#include <cstdlib>
#include <cstdio>
#include <tr1/cstdint>
#include <ctgmath>
#include "opcodes.h"

VM::VM(int32_t *_code, int32_t _pc, int32_t _stackSize, bool _debug) {
    code = _code;
    pc = _pc;
    fp = 0;
    sp = -1;
    stackSize = _stackSize;
    stack = (int32_t *) malloc(sizeof(int32_t) * _stackSize);
    debug = _debug;
}

VM::~VM() {
    free(stack);
}

void VM::push(int32_t value) { stack[++sp] = value; }

int32_t VM::nextCode(bool show=true) {
    int next = code[pc++];
    if (debug && show) printf(" %d", next);
    return next;
}

int32_t VM::pop() { return stack[sp--]; }

void VM::printStack() {
    printf("pc=%d sp=%d fp=%d stack: [", pc, sp, fp);
    for (int i = 0; i < sp+1; i++) {
        printf(" %d", stack[i]);
    }
    printf(" ]\n");
}

int VM::run() {
    do {
        int32_t opcode = nextCode(false);     
        int32_t v, addr, offset, a, b, argc, rval;
        if (opcode < 1 || opcode > HALT) {
            fprintf(stdout, "Invalid opcode: %d\nAborting\n", opcode);
            return 2;
        }
        if (debug) {
            std::string name = opcodeToName.at(opcode);
            printf("Executing %s", &name[0]);
        }
        switch (opcode) {       
            case HALT:
                return 0;
            case CONST_I32:
                v = nextCode();
                push(v);
                break;
            case ADD_I32:
                b = pop();
                a = pop();
                push(a + b);
                break;
            case SUB_I32:
                b = pop();
                a = pop();
                push(a - b);
                break;
            case MUL_I32:
                b = pop();
                a = pop();
                push(a * b);
                break;
            case DIV_I32:
                b = pop();
                a = pop();
                push(a / b);
                break;
            case POW:
                b = pop();
                a = pop();
                push((int) floor(pow(a, b)));
                break;
            case LT_I32:
                b = pop();
                a = pop();
                push((a < b) ? 1 : 0);
                break;
            case LTE_I32:
                b = pop();
                a = pop();
                push((a <= b) ? 1 : 0);
                break;
            case NOT:
                a = pop();
                push((a != 0) ? 0 : 1);
                break;
            case EQ_I32:
                b = pop();
                a = pop();
                push((a == b) ? 1 : 0);
                break;
            case JMP:
                pc += nextCode();
                break;
            case JMPT:
                offset = nextCode();
                if (pop()) {
                    pc += offset;
                }
                break;
            case JMPF:
                offset = nextCode();
                if (!pop()) {
                    pc += offset;
                }
                break;
            case LOAD:                          
                offset = nextCode();
                push(stack[fp + offset]); 
                break;
            case SLOAD: // like LOAD but loads offset from stack
                offset = pop();
                push(stack[fp + offset]);
                break;
            case STORE:                   
                v = pop();
                offset = nextCode();      
                stack[fp + offset] = v;  
                break;
            case SSTORE:
                offset = pop();
                v = pop();
                stack[fp + offset] = v;
                break;
            case SGLOAD:
                addr = pop();
                if(addr < 0){
                    fprintf(stdout, "RuntimeError: Attempting to read from outside the stack\n");
                    return 1;
                }
                v = stack[addr];
                push(v);                
                break;
            case SGSTORE:
                addr = pop();
                if(addr < 0){
                    fprintf(stdout, "RuntimeError: Attempting to write to data outside the stack\n");
                    return 1;
                }
                v = pop();
                stack[addr] = v;
                break;
            case FILLZ:
                offset = nextCode();
                for(int i = 0; i < offset; i++){
                    push(0);
                }
                break;
            case SCALL: // like CALL but take addr from the top of the stack
                addr = pop();
                if(addr < 0){
                    fprintf(stdout, "RuntimeError: Attempting to call an undefined function at instr %d\n", pc);
                    return 1;
                }
                argc = nextCode();
                push(argc);
                push(fp);
                push(pc);
                fp = sp + 1;
                pc = addr;
                break;
            case RET:
                rval = pop();   
                sp = fp - 1;
                pc = pop();     
                fp = pop();     
                argc = pop();   
                sp -= argc;
                push(rval);     
                break;
            case VRET:  // just like RET except without rval
                sp = fp - 1;
                pc = pop();
                fp = pop();
                argc = pop();
                sp -= argc;
                break;
            case POPN:
                sp -= nextCode();
                break;
            case PRINT:
                v = pop();        
                printf("%d\n", v);  
                break;
            default:
                fprintf(stdout, "Unknown opcode: %d\nAborting", opcode);
                return 1;
        }
        if(sp > this->stackSize - 1){
            printf("Stack overflowed. Aborting");
            return 3;
        }
        if (debug){
            printf("\n");
            printStack();
        }
    } while (true);
}