package DynamicProgramming.OneDimension;

import java.util.Arrays;

public class ClimbingStairs {
    public static int solution(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
//            ANSWER IS THE ADDITION OF THE PREVIOUS ELEMENT AND THE DOUBLE PREVIOUS ELEMENT
//            OF THE CURRENT ITERATION
            dp[i] = dp[i - 1] + dp[i - 2];
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
