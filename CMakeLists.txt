cmake_minimum_required(VERSION 3.24)
project(Blind75)

set(CMAKE_CXX_STANDARD 14)

add_executable(Blind75
        cpp/main.cpp cpp/Arrays/ContainsDuplicate.cpp cpp/Arrays/ValidAnagram.cpp cpp/Arrays/TwoSum.cpp)
