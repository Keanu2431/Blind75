//
// Created by Keanu Lumpkin on 4/10/23.
//
#include <vector>
#include <iostream>
#include <unordered_set>

using namespace std;

class ContainsDuplicate {
public:
    static bool solution(std::vector<int> &nums) {
        auto *s = new unordered_set<int>{};
        for (auto i: nums) {
            if (s->find(i) != s->end())return true;
            s->insert(i);
        }
        return false;
    };
};
