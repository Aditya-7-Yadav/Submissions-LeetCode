class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int [][] dp= new int[n+1][1+amount];
        for(int j=1;j<1+amount;j++){
            dp[0][j]=Integer.MAX_VALUE;
            if(j%coins[0]==0)dp[1][j]=j/coins[0];
            else dp[1][j]=Integer.MAX_VALUE;
        }
        for(int i=2;i<1+n;i++){
            for(int j=1;j<1+amount;j++){
                if(coins[i-1]<=j){
                if(dp[i][j-coins[i-1]]!=Integer.MAX_VALUE){
                    dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
}
else dp[i][j]=dp[i-1][j];

            }
        }
        if(dp[n][amount]==Integer.MAX_VALUE)return -1;
        return dp[n][amount];
    }
}