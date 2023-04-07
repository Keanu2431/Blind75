package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean solution(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();

        for (int i : nums) {
            if (integerSet.contains(i)) return true;
            else integerSet.add(i);
        }
        return false;
    }
}
