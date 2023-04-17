package TwoPointers;

public class ValidPalindrome {
    public static boolean solution(String s) {
        if (!(s.length()>1))return true;
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
