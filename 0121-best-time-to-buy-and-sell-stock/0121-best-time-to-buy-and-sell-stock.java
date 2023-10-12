class Solution{
    public int maxProfit(int[] prices){
        int cost,mini=prices[0], profit=0;
        for(int i=1;i<prices.length;i++){
            cost=prices[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,prices[i]);
        }
        return profit;
    }
}