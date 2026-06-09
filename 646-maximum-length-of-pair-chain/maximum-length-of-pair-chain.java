class Solution {
    public int findLongestChain(int[][] pairs) {
        int n=pairs.length,ans=1;
        Arrays.sort(pairs, (a,b) -> Integer.compare(a[1], b[1]));
        int[] dp= new int[n];
        dp[0]=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(pairs[j][1]<pairs[i][0]){
                    ans=Math.max(ans,dp[j]+1);
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
                else break;
            }
        }
        return ans;
    }
}