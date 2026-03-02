class Solution {
    public int scoreDifference(int[] nums) {
        int ans1=0,ans2=0;
        boolean temp1=true;
        for(int i=0;i<nums.length;i++){
            if(i%6==5){
                temp1=!temp1;
            }
            if(nums[i]%2==1)temp1=!temp1;
            if(temp1)ans1+=nums[i];
            else ans2+=nums[i];
        }
        return ans1-ans2;
    }
}