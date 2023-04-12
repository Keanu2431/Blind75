//
// Created by Keanu Lumpkin on 4/10/23.
//

#include <iostream>
#include <vector>
#include "./Arrays/TwoSum.cpp"

using namespace std;

int main() {
    auto *y = new vector<int>{2, 7, 11, 15};
    vector<int> i = TwoSum::solution(*y, 9);
    for (auto y: i)
        std::cout << y << ' ';
};