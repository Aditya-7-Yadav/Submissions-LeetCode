class Solution {
    public int maxJumps(int[] arr, int k) {
        int n=arr.length,ans=0;
        int[] dp= new int[n];
        int[][] nums=new int[n][2];
        for(int i=0;i<n;i++){
            nums[i][0]=arr[i];
            nums[i][1]=i;
            dp[i]=1;
        }
        Arrays.sort(nums,(a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<n;i++){
            int ind=nums[i][1];
            int j=ind+1,temp=0;
            while(j<Math.min(ind+k+1,n) && arr[j]<nums[i][0]){
                temp=Math.max(temp,dp[j]);
                j++;
            }
            j=ind-1;
            while(j>=Math.max(0,ind-k) && arr[j]<nums[i][0]){
                temp=Math.max(temp,dp[j]);
                j--;
            }
            dp[ind]=temp+1;
            ans=Math.max(dp[ind],ans);
        }
        return ans;
    }
}