class Solution {
    public long maximumScore(int[] nums) {
        long ans=Integer.MIN_VALUE;
        int[] nlow= new int[nums.length];
        int low= Integer.MAX_VALUE;
        for(int i=nums.length-1;i>-1;i--){
            if(i==nums.length-1)nlow[i]=0;
            else{
                nlow[i]=low;
            }
            low=Math.min(low,nums[i]);
        }
        long sum=0;
        for(int i=0;i<nums.length-1;i++){
            sum+=nums[i];
            ans=Math.max(ans,sum-nlow[i]);
        }
        return ans;
    }
}