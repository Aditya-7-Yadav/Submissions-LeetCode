class Solution {
    public int findMaxForm(String[] strs, int a, int b) {
        int ans=0,n=strs.length;
        int[][] f= new int[n][2];
        int[][][] dp= new int[n][a+1][b+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<strs[i].length();j++){
                if(strs[i].charAt(j)=='0')f[i][0]++;
                else f[i][1]++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=a;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return knapsack(f,a,b,0,n,dp);
    }
    public int knapsack(int[][] f, int a, int b, int i, int n,int[][][] dp){
        if(i==n)return 0;
        if(dp[i][a][b]>-1)return dp[i][a][b];
        int ans= knapsack(f,a,b,i+1,n,dp);
        if(f[i][0]<=a && f[i][1]<=b)ans=Math.max(ans,1+knapsack(f,a-f[i][0],b-f[i][1],i+1,n,dp));
         dp[i][a][b]=ans;
         return ans;
    }
}