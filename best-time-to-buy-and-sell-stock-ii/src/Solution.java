public class Solution {
    public static void main(String[] args) {
        int[] prices = {2,1,2,0,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length - 1 ; i++) {
            int today = prices[i];
            int tomorrow = prices[i + 1];

            // If tomorrow's price will be higher than today's -> Buy and Sell
            // If not, you know you'd be better off buying tomorrow rather than today.
            if (today < tomorrow) {
                profit += (tomorrow - today);
            }
        }
        return profit;
    }
}


