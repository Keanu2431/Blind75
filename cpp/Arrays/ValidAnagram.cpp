//
// Created by Keanu Lumpkin on 4/10/23.
//

#include <string>
#include <iostream>

using namespace std;

class ValidAnagram {
public:
    static bool solution(string s, string t) {
        if (s.length() != t.length())return false;
        int charMap[26]{0};
        for (int i = 0; i < s.length(); ++i) {
            charMap[s[i] - 'a']++;
            charMap[t[i] - 'a']--;
        }
        for (int i: charMap)
            if (i != 0)return false;
        return true;
    };
};