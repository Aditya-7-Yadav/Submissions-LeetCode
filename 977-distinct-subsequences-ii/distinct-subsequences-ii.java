class Solution {
    int mod=1000000007;

    public int distinctSubseqII(String s) {
        int n=s.length();
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return trav(s,0,n,dp);
    }

    public int trav(String s,int i,int n,int[] dp){
        if(i==n)return 0;
        if(dp[i]!=-1)return dp[i];

        int ans=0;
        boolean[] seen=new boolean[26];

        for(int j=i;j<n;j++){
            int c=s.charAt(j)-'a';
            if(seen[c])continue;
            seen[c]=true;
            ans=(ans+1+trav(s,j+1,n,dp))%mod;
        }
        return dp[i]=ans;
    }
}