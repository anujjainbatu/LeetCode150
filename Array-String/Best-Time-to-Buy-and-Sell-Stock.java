class Solution {
    public int maxProfit(int[] prices) {
        int cheapest_price = Integer.MAX_VALUE;
        int curr_profit = 0;
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < cheapest_price) {
                cheapest_price = prices[i];
            }
            curr_profit = prices[i] - cheapest_price;
            if (max_profit < curr_profit) {
                max_profit = curr_profit;
            }
        }
        return max_profit;
    }    
}
