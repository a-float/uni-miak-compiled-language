# Coolang Compiler
## Statically typed language compiler with a VM, compiler and assembler

Coolang features:
- defining read-write and read-only variables
- basic integer and boolean operations
- C like pointers
- multidimensional arrays
- functions treated as variables
- flow control (for loops, while loops and if statements)

### Defining Variables:
```
// syntax is [const|mut]? var_name: type
a: int;             // read only variable of type int (implicit const)
const b : int;      // also read only
mut c: bool         // mutable variable of type boolean
const: d : int = 5; // declaration with assignment
```

### Flow control:
```
// while loop
mut a: int = 0;
while a < 5{
   print a;
}

// for loop
for i in 0 to 5 by 1{
   print i;
}

// if statements
const b: bool = true;
if 2 > 3 {
   print 1;
} elif b{
   print 2;
} else {
   print 4;
}
```

### Arrays:
```
const arr = int[3][6];
arr[0][4] = 6;
print arr[1][3];  // prints 6
```

### Functions:
Functions can be defined using variable syntax or the lambda syntax. The difference between the two is that 
lambda syntax allows for reassignable function names at a cost of a longer syntax. 
Function declared normally are always constant.
```
// syntax = fun fun_name: fun_type = statement OR fun fun_name: fun_def_type = statement_block
// fun_def_type defines function's arguments' and return types. Its syntax is ([arg_name: arg_type]*) -> ret_type
fun sum: (a: int, b: int) -> int = a + b;
fun sum: (a: int, b: int) -> int = { ret a + b; }

// lambda function definition
// declare a variable of proper type (mut sum: (int, int) -> int) and assign a lambda function (= (a: int, b: int) -> a + b);
mut sum: (int, int) -> int = (a: int, b: int) -> a + b;
const sumConst: (int, int) -> int = (a: int, b: int) -> { ret a + b; };
```
function types can be nested e.g. `() -> (int) -> int` defines the type of a function returning a function that takes an integer argument and returns an integer

Passing functions as arguments:
```
fun getDoubler: () -> (int) -> int = {
   ret (z: int) -> (2 * z);
}
print getDoubler()(3); // prints 6
```

### Pointers:
```
const arr = int[5]; // an array of zeros
fun changeArr: (p: int*) -> void = {
   arr[0] = 5;  // modify array via global name
   p[1] = 7;   // modify array via the pointer
}
changeArr(arr);
for i in 0 to 5 by 1{
   print arr[i];  // prints 5 7 0 0 0
}

// pointer arithmetics
mut a: int = 0;
mut b: int = 1;
mut c: int = 3;

print *(&a + 2);    // 3
```

### Additional examples:
#### Functions in a multidimensional array
```
const funcs = (int) -> void[3][2];
funcs[1][1] = (x:int) -> {print x;};
funcs[1][1] = (x:int) -> {print x+10;};

print funcs[1][1](5); // 15
```

#### Bubble sort
```
const swap: (int*, int*) -> void = (a: int*, b: int*) -> {
   const tmp: int = *a;
   *a = *b;
   *b = tmp;
};

fun bubbleSort: (a: int*, size: int) -> void = {
   mut done: bool = false;
   while not done{
       mut swapped: bool = false;
       for idx in 0 to (size-1) by 1{
          if a[idx] > a[idx+1]{
               swap(&a[idx], &a[idx+1]);
               swapped = true;
          }
       }
       done = not swapped;
   }
}

const arr = int[10];
const size: int = 10;
for i in 0 to size by 1{
   arr[i] = size - i;
   print arr[i];
}
print -111;
bubbleSort(arr, size);
for i in 0 to size by 1{
   print arr[i];
}
```

# VM and assembler
Coolang machine code is executed on a 32bit stack virtual machine written in C++. 
It has stack pointer, frame pointer, program counter, the stack itself and the code segment and supports 26 instructions.
There is no heap and dynamic memory allocation.

# Usage
All the necessary files are stored in the `build` directory  
  
Compile the source file and saves it to the out file:  
`java -jar cool-compiler.jar [source] [out]`   
  
Execute compiled .cexe file on the vm. Enable debug flag for step by step logging:  
`vm.exe [--debug]? [.cexe file] [stack size]`  
  
Assemble specified coolang assembly code into machine code:  
`assembler.exe [filename]+`  
  
Disassemble the coolang machine code into a readable format:  
`assembler.exe -d [filename]+`  
