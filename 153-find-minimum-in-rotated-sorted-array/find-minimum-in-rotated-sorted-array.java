class Solution {
    public int findMin(int[] nums) {
        int minn=5001;
        for(int i=0;i<nums.length;i++)minn=Math.min(minn,nums[i]);
    return minn;
    }
}