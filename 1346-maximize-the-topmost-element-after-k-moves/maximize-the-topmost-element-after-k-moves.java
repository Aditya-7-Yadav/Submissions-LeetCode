class Solution {
    public int maximumTop(int[] nums, int k) {
        int n=nums.length,ans=0;
        if(k%2==1 && n==1)return -1;
            int maxx=0;
        for(int i=0;i<Math.min(n,k-1);i++)maxx=Math.max(maxx,nums[i]);
            
        if(n>k)maxx=Math.max(maxx,nums[k]);
        
        return maxx;
    }
}