//
// Created by Keanu Lumpkin on 4/10/23.
//
#include <vector>
#include <unordered_map>

using namespace std;

class TwoSum {
public:
    static vector<int> solution(vector<int> &nums, int target) {
        unordered_map<int, int> map;
        vector<int> res;
        for (auto i = 0; i < nums.size(); i++) {
            int current = nums[i];
            int alpha = target - current;
            if (map.find(alpha) != map.end()) {
                res.push_back(i);
                res.push_back(map[alpha]);
            }
            map.insert({current, i});
        }
        return res;
    }
};