package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static public List<List<Integer>> solution(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
//            IF ITS THE FIRST ITERATION OR CURRENT NUMBER ISN'T
//            EQUAL TO PREVIOUS NUMBER
            if (i == 0 || nums[i] != nums[i - 1]) {
//                WERE TRYING TO FIND TWO NUMBERS THAT ADD UP TO
//                THE DIFFERENCE OF 0 AND THE CURRENT NUMBER
                int target = 0 - nums[i];
                int left = i + 1;
                int right = nums.length - 1;
//                KEEP IMPLEMENTING INNER LOOP UNTIL LEFT AND RIGHT MEET
                while (left < right) {
                    if (nums[left] + nums[right] == target) {
                        ArrayList<Integer> miniSol = new ArrayList<>();
                        miniSol.add(nums[i]);
                        miniSol.add(nums[left]);
                        miniSol.add(nums[right]);
                        res.add(miniSol);
//                      IF N[LEFT] IS THE SAME NUMBER AS THE NEXT LEFT ELEMENT SKIP OVER IT
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
//                      IF N[RIGHT] IS THE SAME NUMBER AS THE NEXT RIGHT ELEMENT SKIP OVER IT

                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
//                      IF GREATER THAN TARGET WE NEED A SMALLER NUMBER SO WE GO DOWN ONE RIGHT
                    } else if (nums[left] + nums[right] > target) {
                        right--;
     //                   IF SMALLER THAN TARGET WE NEED A BIGGER NUMBER SO WE GO UP ONE LEFT
                    } else {
                        left++;
                    }
                }
            }
        }
        return res;
    }
    static public List<List<Integer>> solutionT(int[] nums){

    }
}
