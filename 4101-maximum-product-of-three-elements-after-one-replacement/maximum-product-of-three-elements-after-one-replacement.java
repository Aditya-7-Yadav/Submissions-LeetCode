class Solution {
    public long maxProduct(int[] nums) {
        long ans=0;
        long l1=Integer.MIN_VALUE;
        long l2=l1,l3=l1;
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
            if(l1<nums[i]){
                l3=l2;
                l2=l1;
                l1=nums[i];
            }
            else if(l2<nums[i]){
                l3=l2;
                l2=nums[i];
            }
            else if(l3<nums[i])l3=nums[i];
        }
        ans=l1*l2*100000L;
        return ans;
    }
}