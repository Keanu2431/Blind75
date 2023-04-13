package SlidingWindow;

public class MaxProfit {
    //    public static int solution(int[] prices) {
////        7,1,5,3,6,4
//        int maxProfit = 0;
//        int left = 0, right = 1;
//        while (right < prices.length) {
//            if (prices[right] > prices[left]) {
//                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
//                right++;
//            } else {
//                left = right;
//                right++;
//            }
//        }
//        return maxProfit;
//    }
    public static int solution(int[] prices) {
        int maxProfit = 0, left = 0, right = 1;
//        WHILE RIGHT INDEX IS STILL IN BOUND
        while (right < prices.length) {
//            IF NEXT DAY PRICE IS GREATER IT MEANS WE'RE IN PROFIT
            if (prices[right] > prices[left]) {
//              UPDATE MAX PROFIT TO BE THE GREATER OF THE TWO
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);

            } else {
//
                left = right;
            }
//          MOVE OVER TO THE NEXT DAY
            right++;
        }
        return maxProfit;
    }
}
