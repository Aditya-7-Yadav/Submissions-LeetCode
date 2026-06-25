class Solution {
    public int countMajoritySubarrays(int[] nums, int t) {
        int n=nums.length,ans=0;
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=i;j<n;j++){
                if(nums[j]==t)temp++;
                if(temp>(j-i+1)/2)ans++;
            }
        }
        return ans;
    }
}