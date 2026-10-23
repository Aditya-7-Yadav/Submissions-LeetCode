class Solution {
    public int minimumOperations(List<Integer> nums) {
        int ans=0,n=nums.size();
        if(n==1)return 0;
        ans=0;
        int[] dp= new int[n];
        dp[0]=1;
        for(int i=1;i<n;i++){
            int temp=0;
            for(int j=0;j<i;j++){
                if(nums.get(j)<=nums.get(i))temp=Math.max(temp,dp[j]);
            }
            dp[i]=temp+1;
            ans=Math.max(ans,dp[i]);
        }
        return n-ans;
    }
}