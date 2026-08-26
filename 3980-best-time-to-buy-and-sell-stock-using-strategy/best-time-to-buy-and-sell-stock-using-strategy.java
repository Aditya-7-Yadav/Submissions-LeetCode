class Solution {
    public long maxProfit(int[] p, int[] s, int k) {
        long ans=0;
        int n=p.length,st=0;
        long curr=0,currs=0,mx=0;
        for(int i=0;i<n;i++){
            if(i<k)curr+=p[i]*s[i];
            ans+= p[i]*s[i];
        }
        
        for(int i=k/2;i<k;i++)
            currs+=p[i];
        mx=currs-curr;
        for(int i=k;i<n;i++){
            int pr= i-k;
            curr-= (p[pr]*s[pr]);
            curr+=p[i]*s[i];
            currs+=p[i];
            pr+=k/2;
            currs-= p[pr];
            if(currs-curr>mx){
                mx=currs-curr;
                st=i-k+1;
            }
        }
        if(mx<=0)return ans;
        return ans+mx;
    }
}