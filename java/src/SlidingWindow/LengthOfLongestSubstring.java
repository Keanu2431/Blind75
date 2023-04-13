package SlidingWindow;

import java.util.HashSet;

public class LengthOfLongestSubstring {
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
            }else{
                characterHashSet.remove(sChar[left]);
                left++;
            }

        }
        return maxLength;
    }
}
// https://leetcode.com/problems/longest-substring-without-repeating-characters/