package BinarySearch;

public class BinarySearch {
    public static int solution(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middleIndex = (left + right) / 2;
            if (nums[middleIndex] == target) return middleIndex;
            if (nums[middleIndex] < target) left = middleIndex + 1;
            if (nums[middleIndex] > target) right = middleIndex - 1;
        }
        return -1;
    }

    public static int solutionT(int[] nums, int target) {

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) return middle;
            if (nums[middle] < target) left = middle + 1;
            if (nums[middle] > target) right = middle - 1;
        }
        return -1;
    }
}
