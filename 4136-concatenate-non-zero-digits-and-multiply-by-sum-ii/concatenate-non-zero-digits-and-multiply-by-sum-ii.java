class Solution {
    public int[] sumAndMultiply(String s,int[][] q) {
        int mod=1000000007,n=s.length();

        long[] p=new long[n+1];
        long[] pre=new long[n+1];
        long[] ps=new long[n+1];
        int[] nz=new int[n+1];

        p[0]=1;
        for(int i=1;i<=n;i++)p[i]=p[i-1]*10%mod;

        for(int i=0;i<n;i++){
            int d=s.charAt(i)-'0';
            if(d>0){
                pre[i+1]=(pre[i]*10+d)%mod;
                nz[i+1]=nz[i]+1;
            }else{
                pre[i+1]=pre[i];
                nz[i+1]=nz[i];
            }
            ps[i+1]=ps[i]+d;
        }

        int[] ans=new int[q.length];

        for(int i=0;i<q.length;i++){
            int l=q[i][0],r=q[i][1];

            long sm=ps[r+1]-ps[l];
            int len=nz[r+1]-nz[l];

            long x=(pre[r+1]-pre[l]*p[len])%mod;
            if(x<0)x+=mod;

            ans[i]=(int)(x*(sm%mod)%mod);
        }

        return ans;
    }
}