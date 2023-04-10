package Arrays;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] solution(int[] nums) {
        int[] arr = new int[nums.length];
        int right = 1, left = 1;
//        ITERATE FROM THE LEFT SIDE OF THE ARRAY ALL THE VALUES AND ASSIGN
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
            System.out.println(Arrays.toString(arr));

        }
//        1,1,2,8
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }
}
