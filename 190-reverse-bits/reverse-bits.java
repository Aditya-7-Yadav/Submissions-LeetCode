class Solution {
    public int reverseBits(int n) {
        int ans=0,i=0;
        while(i<=30){
            ans+=n&1;
            ans=ans<<1;
            n=n>>1;
            i++;
        }
        return ans;
    }
}