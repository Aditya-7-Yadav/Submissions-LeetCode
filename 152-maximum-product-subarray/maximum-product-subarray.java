class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE,sum=1;
        for(int i=0;i<nums.length;i++){
            sum*=nums[i];
            ans=Math.max(ans,sum);
            if(sum==0)sum=1;
        }
        sum=1;
        for(int i=nums.length-1;i>-1;i--){
            sum*=nums[i];
            ans=Math.max(ans,sum);
            if(sum==0)sum=1;
        }
        return ans;

    }
}