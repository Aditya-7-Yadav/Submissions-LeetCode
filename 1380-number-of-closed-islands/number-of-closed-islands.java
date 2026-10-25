class Solution {
    public int closedIsland(int[][] grid) {
        int ans=0, m=grid.length,n=grid[0].length;
        boolean[][] vis= new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 || vis[i][j])continue;
                if(trav(i,j,m,n,grid,vis))ans++;
            }
        }
        return ans;
    }
    boolean trav(int i,int j,int m, int n, int[][] grid, boolean[][] vis){
        if(i<0 || j<0 || i>=m || j>=n)return false;
        if(vis[i][j] || grid[i][j]==1)return true;
        vis[i][j]=true;
        boolean b1=trav(i+1,j,m,n,grid,vis), b2 =trav(i-1,j,m,n,grid,vis), b3=trav(i,j+1,m,n,grid,vis), b4=trav(i,j-1,m,n,grid,vis);
        return  b1 && b2 && b3 && b4;
    }
}