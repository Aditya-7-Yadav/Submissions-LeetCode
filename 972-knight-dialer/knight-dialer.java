class Solution {
    int mod=1000000007;
    public int knightDialer(int n) {
       int[][] move={{4,6},{6,8},{7,9},{4,8},{0,3,9},{},{0,1,7},{2,6},{1,3},{2,4}};
       int ans=0;
       int[][] dp= new int[10][n+1];
       for(int i=0;i<10;i++)for(int j=0;j<=n;j++)dp[i][j]=-1;
       for(int i=0;i<=9;i++){
        ans=(ans+trav(i,dp,move,n))%mod;
       }
       return ans;
    }
    public int trav(int i,int[][] dp,int[][]move,int n){
        if(1==n)return 1;
        int temp=0;
        if(dp[i][n]!=-1)return dp[i][n];
        for(int ii=0;ii<move[i].length;ii++){
            
            temp=(temp+trav(move[i][ii],dp,move,n-1))%mod;
        }
        return dp[i][n]=temp;
    }
}