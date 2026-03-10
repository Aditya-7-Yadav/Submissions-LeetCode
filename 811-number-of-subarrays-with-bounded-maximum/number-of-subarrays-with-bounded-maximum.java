class Solution {
    public int numSubarrayBoundedMax(int[] nums,int minn,int maxx){
        int ans=0,left=-1,right=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxx)left=i;
            if(nums[i]>=minn)right=i;
            ans+=Math.max(0,right-left);
        }
        return ans;
    }
}