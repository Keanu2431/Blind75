//
// Created by Keanu Lumpkin on 4/10/23.
//
#include <vector>
#include <unordered_map>

using namespace std;

class TwoSum {
public:
    static vector<int> solution(vector<int> &nums, int target) {
        unordered_map<int, int> solution_map;
        vector<int> v;
        for (int i = 0; i < nums.size(); i++) {
            int alpha = target - nums[i];
            if (solution_map.find(alpha) != solution_map.end()) {
//                return vector<int>{solution_map.at(nums[i]),i};
                v.push_back(solution_map[alpha]);
                v.push_back(i);
            } else solution_map.insert({nums[i], i});
        }
        return v;
    }
};