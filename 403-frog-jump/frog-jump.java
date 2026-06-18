class Solution {
    public boolean canCross(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hm= new HashMap<>();
        boolean[][] dp= new boolean[n][n];
        for(int i=0;i<n;i++)hm.put(nums[i],i);
        if(nums[1]-nums[0]<=1){
            
        dp[1][1]=true;
        }
        else return false;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(dp[i][j]){
                    if(i==n-1)return true;
                    int prev=j-1+nums[i],curr=j+nums[i],nxt=nums[i]+j+1;
                    if(hm.containsKey(prev)){
                        dp[hm.get(prev)][j-1]=true;
                    }
                    if(hm.containsKey(curr)){
                        dp[hm.get(curr)][j]=true;
                    }
                    if(hm.containsKey(nxt)){
                        dp[hm.get(nxt)][j+1]=true;
                    }
                }
            }
        }
        return false;
    }
}