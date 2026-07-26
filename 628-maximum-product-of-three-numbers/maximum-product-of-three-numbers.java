class Solution {
    public int maximumProduct(int[] nums) {
        int l1=Integer.MIN_VALUE;
        int n=nums.length;
        Arrays.sort(nums);
        if(nums[0]*nums[1] * nums[n-1] > nums[n-3]*nums[n-1]*nums[n-2]) return nums[0]*nums[1]*nums[n-1];
        return nums[n-1]*nums[n-2]*nums[n-3] ;
    }
}