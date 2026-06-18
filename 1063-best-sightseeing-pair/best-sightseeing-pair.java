class Solution {
    public int maxScoreSightseeingPair(int[] val) {
        int n=val.length,ans=0;
        int temp=val[n-1];
        for(int i=n-2;i>-1;i--){ 
            temp--;
            ans=Math.max(temp+val[i],ans);
            temp=Math.max(temp,val[i]);
        }
        return ans;
    }
}