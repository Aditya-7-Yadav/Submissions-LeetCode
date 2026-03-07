class Solution {
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        int l=grid[0][0],r=n*n;

        while(l<r){
            int mid=(l+r)/2;

            boolean[][] vis=new boolean[n][n];

            if(dfs(grid,0,0,mid,vis))r=mid;
            else l=mid+1;
        }

        return l;
    }

    boolean dfs(int[][] g,int r,int c,int t,boolean[][] vis){
        int n=g.length;

        if(r<0||c<0||r>=n||c>=n||vis[r][c]||g[r][c]>t)return false;

        if(r==n-1&&c==n-1)return true;

        vis[r][c]=true;

        return dfs(g,r+1,c,t,vis)||
               dfs(g,r-1,c,t,vis)||
               dfs(g,r,c+1,t,vis)||
               dfs(g,r,c-1,t,vis);
    }
}