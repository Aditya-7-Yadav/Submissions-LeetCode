class Solution {
    public int maxTwoEvents(int[][] ev) {
        int n=ev.length,ans=0;
        Arrays.sort(ev,(a,b)->a[0]-b[0]);

        int[] suf=new int[n];
        suf[n-1]=ev[n-1][2];

        for(int i=n-2;i>=0;i--)
            suf[i]=Math.max(suf[i+1],ev[i][2]);

        for(int i=0;i<n;i++){
            ans=Math.max(ans,ev[i][2]);

            int l=i+1,r=n-1,idx=-1;

            while(l<=r){
                int m=(l+r)/2;

                if(ev[m][0]>ev[i][1]){
                    idx=m;
                    r=m-1;
                }else l=m+1;
            }

            if(idx!=-1)
                ans=Math.max(ans,ev[i][2]+suf[idx]);
        }

        return ans;
    }
}