class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        Integer[][] dp=new Integer[n][n];
        return trav(nums,0,n-1,dp)>=0;
    }

    public int trav(int[] nums,int f,int l,Integer[][] dp){
        if(f==l)return nums[f];
        if(dp[f][l]!=null)return dp[f][l];

        int left=nums[f]-trav(nums,f+1,l,dp);
        int right=nums[l]-trav(nums,f,l-1,dp);

        return dp[f][l]=Math.max(left,right);
    }
}