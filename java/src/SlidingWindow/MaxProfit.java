package SlidingWindow;

public class MaxProfit {

    public static int solution(int[] prices) {
//        [7,1,5,3,6,4]
        int maxProfit = 0, left = 0, right = 1;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }

        return maxProfit;
    }
}
