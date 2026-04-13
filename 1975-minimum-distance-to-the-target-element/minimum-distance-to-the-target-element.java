class Solution {
    public int getMinDistance(int[] nums, int target, int st) {
        int l=st,r=st;
        while(l>-1){
            if(nums[l]==target)break;
            l--;
        }
        while(r<nums.length){
            if(nums[r]==target)break;
            r++;
        }
        if(l==-1)return r-st;
        if(r==nums.length)return st-l;
        return Math.min(st-l,r-st);
    }
}