class Solution {
    public int minElement(int[] nums) {
        int ans=1000;
        for(int i=0;i<nums.length;i++){
            int n=nums[i],sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            ans=Math.min(sum,ans);
        }
        return ans;
    }
}