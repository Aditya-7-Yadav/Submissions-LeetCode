class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length,ans=1;
        if(n==1)return ans;
        int up=0,curr=0;
        for(int i=1;i<n;i++){
            if(up==1){
                if(nums[i]>nums[i-1]){
                    curr++;
                }
                else{
                    curr=1;
                    if(nums[i]<nums[i-1]){
                        up=-1;
                        curr=2;
                    }
                    else up=0;
                }
            }
            else if(up==-1){
                if(nums[i]<nums[i-1]){
                    curr++;
                }
                else{
                    curr=1;
                    if(nums[i]>nums[i-1]){
                        up=1;
                        curr=2;
                    }
                    else up=0;
                }
            }
            else{
                if(nums[i]>nums[i-1]){
                    curr=2;
                    up=1;
                }
                else if(nums[i]<nums[i-1]){
                    curr=2;
                    up=-1;
                }
                else curr=1;
            }
            ans=Math.max(ans,curr);
        }
        return ans;
    }
}