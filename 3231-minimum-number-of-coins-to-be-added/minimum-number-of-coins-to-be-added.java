class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        long curr=0;
        int ans=0;
        for(int i=0;i<coins.length;i++){
            while(curr+1<coins[i]){
                ans++;
                curr+=curr+1;
            }
            curr+=coins[i];
        }
        while(curr<target){
            ans++;
            curr+=curr+1;
        }
        return ans;
    }
}
