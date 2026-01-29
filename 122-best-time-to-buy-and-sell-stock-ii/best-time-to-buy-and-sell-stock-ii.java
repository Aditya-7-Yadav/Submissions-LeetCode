class Solution {
    public int maxProfit(int[] prices) {
        int ans=0,low=prices[0];
        for(int i=1;i<prices.length;i++){
            if(low<prices[i]){
                ans+=prices[i]-low;
                low=prices[i];
            }
            else
            low=Math.min(low,prices[i]);
        }
    return ans;
    }
}