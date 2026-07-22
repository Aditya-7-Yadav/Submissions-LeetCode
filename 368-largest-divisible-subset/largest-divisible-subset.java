class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<Integer> anss=new ArrayList<>();
        int n=nums.length,ans=0;
        int[] dp= new int[n];
        List<List<Integer>> al= new ArrayList<>();
        for(int i=0;i<n;i++){
            int mx=0,ind=-1;
            for(int j=i-1;j>-1;j--){
                if(dp[j]>mx){
                    if(nums[i]%nums[j]==0){
                        mx=dp[j];
                        ind=j;
                    }
                }
            }
            dp[i]=mx+1;
            if(ind>-1 ){
                al.add(new ArrayList<>(al.get(ind)));
            }
            else al.add(new ArrayList<>());
            al.get(i).add(nums[i]);
            if(ans<dp[i]){
                anss=al.get(i);
                ans=dp[i];
            }
        }
        return anss;
    }
}