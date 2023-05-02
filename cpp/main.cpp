//
// Created by Keanu Lumpkin on 4/10/23.
//

#include <iostream>
#include <vector>
#include "./Arrays/GroupAnagram.cpp"

using namespace std;

int main() {
    vector<std::string> *s = new vector<string>{"eat", "tea", "tan", "ate", "nat", "bat"};
    vector<vector<string>> i = GroupAnagram::solution(*s);

};