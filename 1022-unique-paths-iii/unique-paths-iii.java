class Solution {
    public int uniquePathsIII(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length,blc=0;
        boolean[][] vis=new boolean [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                    blc++;
                    vis[i][j]=true;
                }
            }
        }
        int tot=n*m - blc;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return (trav(i+1,j,grid,vis,tot) + trav(i,j+1,grid,vis,tot) + trav(i-1,j,grid,vis,tot) + trav(i,j-1,grid,vis,tot));
                }
            }
        }
        return 0;
    }
    public int trav(int i,int j, int[][] grid,boolean[][] vis,int tot){
        int n=grid.length;
        int m=grid[0].length,blc=0;
        if(i<0 || j<0 || i>=n || j>=m)return 0;
        if(grid[i][j]==2 ){
            if(tot==0)return 1;
            return 0;
        }
        if(vis[i][j])return 0;
        int ans=0;
        
        vis[i][j]=true;

        ans+=trav(i+1,j,grid,vis,tot-1);
        ans+=trav(i,j+1,grid,vis,tot-1);
        ans+=trav(i-1,j,grid,vis,tot-1);
        ans+=trav(i,j-1,grid,vis,tot-1);
        vis[i][j]=false;
        return ans;
    }
}