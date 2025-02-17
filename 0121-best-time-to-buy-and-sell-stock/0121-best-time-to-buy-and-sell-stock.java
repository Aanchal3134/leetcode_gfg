class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int buy = prices[0];
        int maxP = 0;

        for(int i=1; i<n; i++) {
            if(buy > prices[i]) {
                buy = prices[i];
            } else if(prices[i] - buy > maxP) {
                maxP = prices[i] - buy;
            }
        }
        return maxP;
    }
}