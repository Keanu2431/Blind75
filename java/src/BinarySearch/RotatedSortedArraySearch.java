package BinarySearch;

public class RotatedSortedArraySearch {
    public static int solution(int[] nums, int target) {
//        [4,5,6,7,0,1,2]
        if (nums == null || nums.length == 0) return -1;
        int left = 0, right = nums.length - 1;
//        GOAL IS TO MEET AT INDEX OF SMALLEST ELEMENT
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] > nums[right])
                left = middle + 1;
            else if (nums[middle] < nums[right])
                right = middle;
        }
//        LEFT BECOMES SMALLEST INDEX/STARTING POINT
        int start = left;
//        REST VARS
        left = 0;
        right = nums.length - 1;
//        DETERMINE WHICH HALF OF ARRAY WE'RE SEARCHING ON
//        eg: if we're looking for 1 we'll have left be equal to start which is
//        is the smallest numbers index
//        else right would be the index of the smallest element and all elements
//        left of it would be bigger than the smallest number
//        [4,5,6,7,0,1,2]
        if (target >= nums[start] && target <= nums[right])
            left = start;
        else
            right = start;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) return middle;
            if (nums[middle] < target) left = middle + 1;
            if (nums[middle] > target) right = middle - 1;
        }
        return -1;
    }
}
