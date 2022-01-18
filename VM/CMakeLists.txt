cmake_minimum_required(VERSION 3.20)
project(VM)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(assembler src/assembler.cpp)
add_executable(vm src/main.cpp src/vm.cpp)
