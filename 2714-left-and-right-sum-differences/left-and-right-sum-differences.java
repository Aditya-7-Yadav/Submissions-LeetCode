class Solution {
    public int[] leftRightDifference(int[] nums) {
        int curr=0,n=nums.length;
        int[] ans=new int[n];
        for(int i=n-1;i>-1;i--){
            ans[i]=curr;
            curr+=nums[i];
        }
        curr=0;
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(ans[i]-curr);
            curr+=nums[i];
        }
        return ans;
    }
}