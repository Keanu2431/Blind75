//
// Created by Keanu Lumpkin on 5/2/23.
//
#include <vector>
#include <iostream>
#include <unordered_map>
#include <queue>

using namespace std;

class TopKFrequent {
public:
    static std::vector<int> solution(std::vector<int> &nums, int k) {
        unordered_map<int, int> map;

        vector<int> ans;

        priority_queue<pair<int, int>> pq;

        for (auto i: nums) {
            map[i]++;
        }

        for (auto i: map) {
            cout << to_string(i.first) + " : " + to_string(i.second) << endl;
            // key value gets switched
            pq.push({i.second, i.first});
        }

        while (k--) {
            ans.push_back(pq.top().second);
            pq.pop();
        }

        return ans;
    }
};