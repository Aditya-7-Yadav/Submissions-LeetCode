class Solution {
    public boolean isTrionic(int[] nums) {
        int i=0,count=0;
        while(i<nums.length-1 && nums[i]<nums[i+1])i++;
        if(i>0)count++;
        else return false;
        while(i<nums.length-1 && nums[i]>nums[i+1])i++;
        if(i<nums.length-1)count++;
        else return false;
        while(i<nums.length-1 && nums[i]<nums[i+1])i++;
        if(i==nums.length-1)count++;
        return count==3;
    }
}