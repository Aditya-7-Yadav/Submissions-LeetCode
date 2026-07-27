class Solution {
    public int maxProduct(int[] nums) {
        int h1=0,h2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=h1){
                h2=h1;
                h1=nums[i];
            }
            else if(h2<nums[i])h2=nums[i];
        }
        return (h1-1)*(h2-1);
    }
}