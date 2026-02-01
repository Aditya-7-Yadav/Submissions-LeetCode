class Solution {
    public int minimumCost(int[] nums) {
        int f=100,s=100,t=100;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=f){
                t=s;
                s=f;
                f=nums[i];
            }
            else if(nums[i]<=s){
                t=s;
                s=nums[i];
            }
            else if(nums[i]<t)t=nums[i];
        }
        return nums[0]+s+f;
    }
}