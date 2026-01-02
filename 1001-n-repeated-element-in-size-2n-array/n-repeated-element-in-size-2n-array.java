class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();

        Arrays.sort(nums);
        if(nums[nums.length/2 - 1]==nums[0])return nums[0];
        return nums[nums.length/2];
    }
}