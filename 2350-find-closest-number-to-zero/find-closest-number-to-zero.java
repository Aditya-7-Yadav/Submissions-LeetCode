class Solution {
    public int findClosestNumber(int[] nums) {
        int ans=-99999,dist=999999;
        for(int i=0;i<nums.length;i++){
            int abs=Math.abs(nums[i]);
            if(abs<dist){
                dist=abs;
                ans=nums[i];
            }
            if(nums[i]>0 && nums[i]==-1*ans)ans=nums[i];
        }
        return ans;
    }
}