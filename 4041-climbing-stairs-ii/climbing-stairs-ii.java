class Solution {
    public int climbStairs(int n, int[] c) {
        int ans=9999999;
        int[] dp = new int[n];
        if(n<2)return c[0]+1;
        if(n<3)return Math.min(c[0]+1+c[1]+1,c[1]+4);
        dp[0]=c[0]+1;
        dp[1]=Math.min(c[1]+4,c[1]+dp[0]+1);
        dp[2]=Math.min(c[2]+9,c[2]+Math.min(dp[0]+4,dp[1]+1));
        for(int i=3;i<n;i++){
            dp[i]=999999999;
            for(int j=1;j<4;j++){
                dp[i]=Math.min(dp[i],dp[i-j]+j*j);
            }
            dp[i]+=c[i];
        }
        return dp[n-1];
    }
}