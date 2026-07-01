class Solution {
    public int minimumEffortPath(int[][] h) {
        int m=h.length,n=h[0].length;
        int l=0,r=1000000;

        while(l<r){
            int mid=l+(r-l)/2;
            boolean[][] vis=new boolean[m][n];

            if(trav(vis,h,0,0,m,n,mid))
                r=mid;
            else
                l=mid+1;
        }

        return l;
    }

    public boolean trav(boolean[][] vis,int[][] h,int i,int j,int m,int n,int lim){
        if(i<0 || j<0 || i>=m || j>=n || vis[i][j])return false;
        if(i==m-1 && j==n-1)return true;

        vis[i][j]=true;

        if(i+1<m && Math.abs(h[i+1][j]-h[i][j])<=lim)
            if(trav(vis,h,i+1,j,m,n,lim))return true;

        if(i-1>=0 && Math.abs(h[i-1][j]-h[i][j])<=lim)
            if(trav(vis,h,i-1,j,m,n,lim))return true;

        if(j+1<n && Math.abs(h[i][j+1]-h[i][j])<=lim)
            if(trav(vis,h,i,j+1,m,n,lim))return true;

        if(j-1>=0 && Math.abs(h[i][j-1]-h[i][j])<=lim)
            if(trav(vis,h,i,j-1,m,n,lim))return true;

        return false;
    }
}