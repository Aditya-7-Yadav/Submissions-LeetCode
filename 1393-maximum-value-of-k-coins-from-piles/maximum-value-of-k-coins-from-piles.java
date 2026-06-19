class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int[] dp=new int[k+1];

        for(int i=0;i<piles.size();i++){
            List<Integer> p=piles.get(i);
            int m=p.size();

            int[] pre=new int[m+1];
            for(int j=0;j<m;j++){
                pre[j+1]=pre[j]+p.get(j);
            }

            int[] ndp=dp.clone();

            for(int j=1;j<=k;j++){
                for(int t=1;t<=Math.min(j,m);t++){
                    ndp[j]=Math.max(ndp[j],dp[j-t]+pre[t]);
                }
            }

            dp=ndp;
        }

        return dp[k];
    }
}