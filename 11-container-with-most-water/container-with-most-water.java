class Solution {
    public int maxArea(int[] nums) {
        int ans=0,left=0,right=nums.length-1;
        while(left<right){
            ans=Math.max(Math.min(nums[right],nums[left])*(right-left),ans);
            if(nums[left]<nums[right]) left++;
            else right--;
        }
        return ans;
    }
}