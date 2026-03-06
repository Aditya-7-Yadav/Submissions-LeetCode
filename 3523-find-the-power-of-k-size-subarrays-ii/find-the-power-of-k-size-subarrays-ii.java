class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int diff=0;
        int[] ans= new int[n-k+1];
        boolean sted=true;
        for(int i=0;i<k-1;i++){
            if(nums[i+1]!=1+nums[i])diff++;
        }
        if(diff!=0)ans[0]=-1;
        else ans[0]=nums[k-1];
        int j=1;
        for(int i=k;i<n;i++){
            if(nums[i]!=1+nums[i-1])diff++;
            if(nums[i-k]+1!=nums[i-k+1])diff--;
            if(diff!=0)ans[j]=-1;
        else ans[j]=nums[i];
        j++;
        }
        return ans;
    }
}