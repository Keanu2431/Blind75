package Arrays;

public class ValidAnagram {
    public static boolean solution(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] alphabet = new int[26];
        for (char c : s.toCharArray())
            alphabet[c - 'a']++;
        for (char c : t.toCharArray())
            alphabet[c - 'a']--;
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) return false;
        }
        return true;
    }
}
