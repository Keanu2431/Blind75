package SlidingWindow;

import java.util.HashSet;

public class LengthOfLongestSubstringWithoutRepeatingCharacters {
    static public int solution(String s) {
        char[] sChar = s.toCharArray();
        HashSet<Character> characterHashSet = new HashSet<>();

        int maxLength = 0;
        int left = 0, right = 0;

        while (right < sChar.length) {
            if (!characterHashSet.contains(sChar[right])) {
                characterHashSet.add(sChar[right]);
                right++;
                maxLength = Math.max(maxLength, characterHashSet.size());
            } else {
                characterHashSet.remove(sChar[left]);
                left++;
            }

        }
        return maxLength;
    }

    static public int solutionT(String s) {
//        abcabc
        HashSet<Character> characterHashSet = new HashSet<>();
        char[] chars = s.toCharArray();
        int left = 0, right = 0, longest = 0;
        while (right < chars.length) {
            if (!characterHashSet.contains(chars[right])) {
                characterHashSet.add(chars[right]);
                right++;
                longest = Math.max(longest, characterHashSet.size());
            }else{
                characterHashSet.remove(chars[left]);
                left++;
            }
        }
        return longest;
    }
}
// https://leetcode.com/problems/longest-substring-without-repeating-characters/