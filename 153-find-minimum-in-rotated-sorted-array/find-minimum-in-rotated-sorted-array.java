class Solution {
    public int findMin(int[] nums) {
        int fs= 0,n=nums.length,ans=5001;
        int ls=n-1;
        while(fs<ls){
            int mid=(fs+ls)/2;
            ans=Math.min(ans,nums[mid]);
            if(nums[mid]>nums[ls]){
                fs=mid+1;
            }
            else ls=mid-1;
        }
        return Math.min(ans,nums[fs]);
    }
}