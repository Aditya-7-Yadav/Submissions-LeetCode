class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans=1,n=nums.length;
        int[] dp= new int[n];
        dp[n-1]=1;
        for(int i=n-2;i>-1;i--){
            if(nums[i+1]>nums[i])dp[i]=dp[i+1]+1;
            else dp[i]=1;
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}