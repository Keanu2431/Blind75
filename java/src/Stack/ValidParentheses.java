package Stack;

public class ValidParentheses {
    public static boolean solution(String s) {
        boolean v = true;
        int left = 0, right = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                switch (s.charAt(i)) {
                    case ')' -> v = s.charAt(i - 1) == '(';
                    case ']' -> v = s.charAt(i - 1) == '[';
                    case '}' -> v = s.charAt(i - 1) == '{';
                }
            } else if (i == 0) {
                switch (s.charAt(i)) {
                    case '(' -> v = s.charAt(i + 1) == ')';
                    case '[' -> v = s.charAt(i + 1) == ']';
                    case '{' -> v = s.charAt(i + 1) == '}';
                }
            }

        }

//        while (right < s.length()) {
//            char[] chars = new char[]{s.charAt(left), s.charAt(right)};
//            switch (chars[0]){
//                case:
//            }
//            left++;
//            right++;
//        }
        return v;
    }
}
//https://leetcode.com/problems/valid-parentheses/
