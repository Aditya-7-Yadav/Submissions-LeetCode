class Solution {
    public long countCommas(long n) {
        if(n<=999)return 0;
        
        long ans=0;
        long mult=1000;
        int commas=1;
        
        while(mult<=n){
            long upper=Math.min(n+1,mult*1000);
            ans+=(upper-mult)*commas;
            mult*=1000;
            commas++;
        }
        
        return ans;
    }
}