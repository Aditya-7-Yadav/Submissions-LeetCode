class Solution {
    public long maximumMedianSum(int[] nums) {
        long ans=0;
        Arrays.sort(nums);
        int k=nums.length-1;
        while(k>=nums.length/3){
            ans+=nums[k-1];
            k-=2;
        }
        return ans;
    }
}