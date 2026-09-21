class Solution {
    public int coinChange(int[] nums, int amt) {
        int n=nums.length;
        int [][] dp= new int[n+1][1+amt];
        for(int j=1;j<=amt;j++)dp[0][j]=Integer.MAX_VALUE-1;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<amt+1;j++){
                if(nums[i-1]>j)dp[i][j]=dp[i-1][j];
                else{
                    dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-nums[i-1]]);
                }
            }
        }
        if(dp[n][amt]==Integer.MAX_VALUE-1)return -1;
        return dp[n][amt];
    }
}