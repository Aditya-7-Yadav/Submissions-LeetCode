class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length,ans=1,curr=1;
        int[][]dp = new int[n][2];
        dp[n-1][1]=1;
        dp[n-1][0]=1;
        for(int i=n-2;i>-1;i--){
            int temp=0,hi=0;
            for(int j=i+1;j<n;j++){
                if(nums[j]>nums[i]){
                    hi=Math.max(hi,dp[j][1]);
                }
            }
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j] && dp[j][1]==hi){
                    temp+=dp[j][0];
                }
            }
            dp[i][0]=Math.max(1,temp);
            dp[i][1]=hi+1;
            if(dp[i][1]==curr){
                ans+=dp[i][0];
            }
            else if(dp[i][1]>curr){
                curr=dp[i][1];
                ans=dp[i][0];
            }
        }
        return ans;
    }
}