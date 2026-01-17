class Solution {
    public int longestPalindromeSubseq(String s1) {
        String s2=new StringBuilder(s1).reverse().toString();
        int n=s1.length();
        int m=s2.length();
        int[][] dp= new int[n][m];
        for(int i=0;i<n;i++)for(int j=0;j<m;j++)dp[i][j]=-1;
        return trav(s1,s2,n-1,m-1,dp);
    }
    public static int trav(String s1, String s2,int n,int m,int[][] dp){
        if(n==-1||m==-1)return 0;
        if(dp[n][m]!=-1)return dp[n][m];
        if(s1.charAt(n)==s2.charAt(m))return dp[n][m]=1+trav(s1,s2,n-1,m-1,dp);
        return dp[n][m]=Math.max(trav(s1,s2,n,m-1,dp),trav(s1,s2,n-1,m,dp));
    }
}