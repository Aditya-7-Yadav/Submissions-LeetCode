class Solution {
    public boolean isTrionic(int[] nums) {
        int i=0,count=0;
        while(i<nums.length-1 && nums[i]<nums[i+1])i++;
        if(i>0)count++;
        while(i<nums.length-1 && nums[i]>nums[i+1])i++;
        if(i<nums.length-1)count++;
        while(i<nums.length-1 && nums[i]<nums[i+1])i++;
        if(i==nums.length-1)count++;
        return count==3;
    }
}