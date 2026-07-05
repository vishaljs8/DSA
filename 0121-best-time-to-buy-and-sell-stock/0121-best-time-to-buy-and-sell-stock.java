class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit=0;
        int cost;
        for (int i =1 ; i < prices.length ; i++){
             cost = prices[i]-min;
             maxProfit = Math.max(cost,maxProfit);
             min = Math.min(min,prices[i]);

        }
        return maxProfit;
    }
}