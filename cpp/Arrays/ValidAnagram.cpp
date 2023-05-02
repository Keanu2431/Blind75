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
        int char_array[26]{0};

        for (int i = 0; i < s.length(); i++) {
            char current_letter_s = s[i];
            char current_letter_t = t[i];
            char_array[current_letter_s - 'a']++;
            char_array[current_letter_t - 'a']--;
        }
        cout << *char_array << endl;
        for (int i: char_array) {
            if (i != 0)return false;
        }
        return true;

    };
};