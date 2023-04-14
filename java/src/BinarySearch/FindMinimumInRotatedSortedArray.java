package BinarySearch;

public class FindMinimumInRotatedSortedArray {
        public static int solution(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            if (nums[left] <= nums[right]) return nums[left];
            int middle = (left + right) / 2;

            if (nums[middle] >= nums[left]) {
                left = middle + 1;
            } else {
                right = middle;
            }

        }
        return 0;
    }
    
}
