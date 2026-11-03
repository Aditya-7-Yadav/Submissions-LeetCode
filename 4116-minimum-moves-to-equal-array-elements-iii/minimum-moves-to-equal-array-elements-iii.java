class Solution {
    public int minMoves(int[] nums) {
        int ans=0,maxx=0;
        for(int i=0;i<nums.length;i++)maxx=Math.max(nums[i],maxx);
        for(int i=0;i<nums.length;i++)ans+=maxx-nums[i];
        return ans;
    }
}