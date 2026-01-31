class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int i=0,j=nums.length-1;
        while(i<j && nums[i]==nums[i+1]){
            i++;
        }
        while(j>0 && nums[j]==nums[j-1]){
            j--;
        }
        return Math.max(0,j-i-1);
    }
}