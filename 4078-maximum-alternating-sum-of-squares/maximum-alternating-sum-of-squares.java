class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;i++)nums[i]=Math.abs(nums[i]);
        Arrays.sort(nums);
        int left=0,right,n=nums.length;
        right=n-1;
        while(left<right){
            ans-= nums[left]*nums[left];
            ans+=nums[right]*nums[right];
            left++;
            right--;
        }
        if(left==right)ans+=nums[right]*nums[right];
        return ans;
    }
}