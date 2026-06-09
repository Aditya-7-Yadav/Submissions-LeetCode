class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long maxx=0,minn=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            maxx=Math.max(maxx,nums[i]);
            minn=Math.min(minn,nums[i]);
        }
        return (maxx-minn)*k;
    }
}