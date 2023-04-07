package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int a = target - currentNum;
            if (integerMap.containsKey(a)) return new int[]{integerMap.get(a), i};
            integerMap.put(currentNum, i);
        }
        System.out.println(integerMap);
        return new int[]{};
    }
}
