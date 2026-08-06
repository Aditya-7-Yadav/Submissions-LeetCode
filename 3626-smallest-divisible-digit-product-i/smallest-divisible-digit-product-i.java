class Solution {
    public int smallestNumber(int n, int t) {
        if(n<=t)return t;
        int ans=0;
        for(int i=n;i<=109;i++){
            int temp=i,sum=1;
            while(temp>0){
                sum*=temp%10;
                temp/=10;
            }
            if(sum%t==0)return i;
        }
        return t;
    }
}