class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0,ans=0;
        int n=nums.length;
        for(int i=0;i<k;i++)sum+=nums[i];
        ans=sum/k;
        for(int i=k;i<n;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            ans=Math.max(ans,sum/k);
        }
        return ans;
    }
}