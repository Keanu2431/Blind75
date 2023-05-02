package Arrays;

public class LongestConsecutive {
    static public int solution(int[] nums) {
        if (nums.length < 2) return nums.length;
        int answer = 1;
        int count = 1;
        java.util.Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
//            getting the current number
            int current = nums[i];
            int previousNumber = nums[i - 1];
//          IF previous is the same skip iteration
            if (previousNumber == current) continue;
//          if current is one number greater then previous increase count
            if (previousNumber + 1 == current) {
                count++;
//          else update answer based on current count and reset count
            } else {
                answer = Math.max(answer, count);
                count = 1;
            }
        }
        answer = Math.max(answer, count);
        return answer;
    }
}
