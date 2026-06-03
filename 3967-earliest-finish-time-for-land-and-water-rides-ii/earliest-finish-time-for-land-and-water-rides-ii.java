class Solution {
    public int earliestFinishTime(int[] ls,int[] ld,int[] ws,int[] wd) {
        int n=ws.length;
        int[][] w=new int[n][2];

        for(int i=0;i<n;i++){
            w[i][0]=ws[i];
            w[i][1]=wd[i];
        }

        Arrays.sort(w,(a,b)->a[0]-b[0]);

        int[] pre=new int[n];
        int[] suf=new int[n];

        pre[0]=w[0][1];

        for(int i=1;i<n;i++)
            pre[i]=Math.min(pre[i-1],w[i][1]);

        suf[n-1]=w[n-1][0]+w[n-1][1];

        for(int i=n-2;i>=0;i--)
            suf[i]=Math.min(suf[i+1],w[i][0]+w[i][1]);

        int ans=Integer.MAX_VALUE;

        for(int i=0;i<ls.length;i++){
            int t=ls[i]+ld[i];

            int l=0,r=n-1,idx=-1;

            while(l<=r){
                int m=(l+r)/2;

                if(w[m][0]<=t){
                    idx=m;
                    l=m+1;
                }else r=m-1;
            }

            if(idx!=-1)
                ans=Math.min(ans,t+pre[idx]);

            if(idx+1<n)
                ans=Math.min(ans,suf[idx+1]);
        }

        n=ls.length;

        int[][] land=new int[n][2];

        for(int i=0;i<n;i++){
            land[i][0]=ls[i];
            land[i][1]=ld[i];
        }

        Arrays.sort(land,(a,b)->a[0]-b[0]);

        pre=new int[n];
        suf=new int[n];

        pre[0]=land[0][1];

        for(int i=1;i<n;i++)
            pre[i]=Math.min(pre[i-1],land[i][1]);

        suf[n-1]=land[n-1][0]+land[n-1][1];

        for(int i=n-2;i>=0;i--)
            suf[i]=Math.min(suf[i+1],land[i][0]+land[i][1]);

        for(int i=0;i<ws.length;i++){
            int t=ws[i]+wd[i];

            int l=0,r=n-1,idx=-1;

            while(l<=r){
                int m=(l+r)/2;

                if(land[m][0]<=t){
                    idx=m;
                    l=m+1;
                }else r=m-1;
            }

            if(idx!=-1)
                ans=Math.min(ans,t+pre[idx]);

            if(idx+1<n)
                ans=Math.min(ans,suf[idx+1]);
        }

        return ans;
    }
}