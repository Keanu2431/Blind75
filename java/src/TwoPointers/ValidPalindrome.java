package TwoPointers;

public class ValidPalindrome {
    public static boolean solution(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuilder reverse = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {

            reverse.append(s.charAt(i));
        }
        System.out.println(reverse);
        return s.equals(reverse.toString());
    }
}
