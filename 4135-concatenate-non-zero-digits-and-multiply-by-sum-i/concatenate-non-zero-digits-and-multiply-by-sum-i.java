class Solution {
    public long sumAndMultiply(int n) {
        long ans=0,sum=0;
        while(n>0){
            int temp=n%10;
            n/=10;
            if(temp>0){
                ans*=10;
                ans+=temp;
                sum+=temp;
            }
        }
        long nn=ans;
        ans=0;
        while(nn>0){
            ans*=10;
            ans+=nn%10;
            nn/=10;
        }
        return ans*sum;
    }
}