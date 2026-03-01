class Solution {
    public int kthFactor(int n, int k) {
        int cnt=1;
        if(k>=n && n>2)return -1;
        if(k==1)return 1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)cnt++;
            if(cnt==k)return i;
        }
        cnt++;
        if(cnt==k)return n;
        return -1;
    }
}