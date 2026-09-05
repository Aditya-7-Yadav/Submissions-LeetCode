class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] pre= new int[n];
        int[] post= new int[n];
        pre[0]=nums[0];
        if(n==1)return 0;
        post[n-1]= nums[n-1];
        for(int i=n-2;i>=0;i--){
            post[i]=Math.min(post[i+1],nums[i]);
        }
        for(int i=1;i<n;i++){
            pre[i]=Math.max(pre[i-1],nums[i]);
            
        }
        for(int i=0;i<n;i++)if(pre[i]-post[i]<=k)return i;
        return -1;

    }
}