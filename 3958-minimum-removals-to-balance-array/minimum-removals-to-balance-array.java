class Solution {
    public int minRemoval(int[] nums,int k){
        Arrays.sort(nums);
        int n=nums.length;
        int l=0,ans=n;
        for(int r=0;r<n;r++){
            while(l<=r && (long)nums[r]>(long)k*nums[l])l++;
            ans=Math.min(ans,n-(r-l+1));
        }
        return ans;
    }
}
