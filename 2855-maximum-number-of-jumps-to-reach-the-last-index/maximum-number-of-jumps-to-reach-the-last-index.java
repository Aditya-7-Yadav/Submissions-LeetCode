class Solution {
    public int maximumJumps(int[] nums, int target) {
        int n=nums.length;
        int dp[] = new int[n];
        boolean r[]=new boolean[n];
        r[n-1]=true;
        for(int i=n-1;i>-1;i--){
            int curr=0;
            boolean jump=false;
            for(int j=i+1;j<n;j++){
                if(Math.abs(nums[i]-nums[j])<=target && r[j]){
                    curr=Math.max(curr,dp[j]);
                    jump=true;
                    r[i]=true;
                }
            }
            if(jump)curr++;
            dp[i]=curr;
        }
        if(dp[0]==0)return -1;
        return dp[0];
    }
}