//
// Created by Keanu Lumpkin on 5/2/23.
//
#include <string>
#include <vector>
#include <unordered_map>
#include <map>
#include <iostream>

using namespace std;

class GroupAnagram {
public:
    static
    vector<vector<string>> solution(vector<string> &strs) {
        vector<vector<string>> ans;
        unordered_map<string, vector<string>> map;
        for (auto i: strs) {
            string sorted_string = i;
            sort(sorted_string.begin(), sorted_string.end());
            map[sorted_string].push_back(i);
        }
        for (auto i: map) {
            ans.push_back(i.second);
        }
        return ans;
    }

private:
    void printList() {

    }
};