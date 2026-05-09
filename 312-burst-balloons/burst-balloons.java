class Solution {
    public int maxCoins(int[] nums) {
        int c=2;
        for(int i=0;i<nums.length;i++)
            if(nums[i]>0)
                c++;

        int[] a=new int[c];
        a[0]=1;
        a[c-1]=1;

        int id=1;

        for(int i=0;i<nums.length;i++)
            if(nums[i]>0)
                a[id++]=nums[i];

        int n=a.length;
        int[][] dp=new int[n][n];

        for(int len=1;len<n-1;len++){
            for(int l=0;l<n-1-len;l++){
                int r=l+len+1;

                for(int i=l+1;i<r;i++){
                    dp[l][r]=Math.max(
                        dp[l][r],
                        a[l]*a[i]*a[r]
                        +dp[l][i]
                        +dp[i][r]
                    );
                }
            }
        }

        return dp[0][n-1];
    }
}