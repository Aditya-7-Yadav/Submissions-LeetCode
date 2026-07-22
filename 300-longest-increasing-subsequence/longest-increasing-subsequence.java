class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp= new int[nums.length];
        int n=nums.length,ans=1;
        for(int i=n-1;i>-1;i--){
            int mx=0;
        for(int j=i+1;j<n;j++){
            if(nums[j]>nums[i])mx=Math.max(dp[j],mx);
        }
        dp[i]=mx+1;
        ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}