//
// Created by Keanu Lumpkin on 4/10/23.
//

#include <iostream>
#include <vector>
#include "./Arrays/ProductExceptSelf.cpp"
#include "./Arrays/TopKFrequent.cpp"

using namespace std;

int main() {
//    vector<int> k={1, 2, 3, 4};
//    auto i = ProductExceptSelf::solution(k);

    vector<int> y = {2, 1, 1, 1, 2, 3};
    auto x = TopKFrequent::solution(y, 2);
    for (auto p: x) {
        cout << p << endl;
    }


};