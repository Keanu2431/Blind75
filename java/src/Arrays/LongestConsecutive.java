package Arrays;

public class LongestConsecutive {
    static public int solution(int[] nums) {
        if (nums.length < 2) return nums.length;
        int answer = 1;
        int count = 1;
        java.util.Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {

            int current = nums[i];
            int previousNumber = nums[i - 1];
            if (previousNumber == current) continue;

            if (previousNumber + 1 == current) {
                count++;
            } else {
                answer = Math.max(answer, count);
                count = 1;
            }
        }
        answer = Math.max(answer, count);
        return answer;

    }
}
