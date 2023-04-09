package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicate {
    public static boolean solution(int[] nums) {
        HashSet<Integer> integerSet = new HashSet<>();

        for (int i : nums) {
            if (integerSet.contains(i)) return true;
            else integerSet.add(i);
        }
        return false;
    }

    public static boolean solutionTwo(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            if (map.containsKey(i)) map.put(i, map.get(i) + 1);
            map.putIfAbsent(i, 1);
        }
        for (var i:map.entrySet()
             ) {
            if (i.getValue()>1)return true;
        }
        return false;
    }
}
