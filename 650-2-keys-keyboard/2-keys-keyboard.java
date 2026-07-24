class Solution {
    public int minSteps(int n) {
        if(n==1)return 0;
        boolean cp=true;
        int[] dp= new int[n+1];
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<=n;i++){
            dp[i]=9999;
            for(int j=i-1;j>0;j--){
                if(i%j==0)
            dp[i]=Math.min(dp[i],dp[j]+i/j);
    
            }
        }
        return dp[n];
    }
    
}