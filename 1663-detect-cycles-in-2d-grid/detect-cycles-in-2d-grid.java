class Solution {
    public boolean containsCycle(char[][] grid) {
        int m=grid.length,n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j]){
                    vis[i][j]=true;
                if(trav(i+1,j,grid,grid[i][j],'u',vis) ||trav(i,j+1,grid,grid[i][j],'l',vis) ||trav(i-1,j,grid,grid[i][j],'d',vis) ||trav(i,j-1,grid,grid[i][j],'r',vis)  ) return true;
            }
            }
        }
        return false;
    }
    public boolean trav(int i,int j,char[][] grid,char prev,char dir, boolean[][] vis){
        int m=grid.length,n=grid[0].length;
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]!=prev)return false;
        if(vis[i][j] && grid[i][j]==prev){
            return true;
        }
        vis[i][j]=true;
        if(dir=='u')return (trav(i+1,j,grid,grid[i][j],'u',vis) ||trav(i,j+1,grid,grid[i][j],'l',vis) ||trav(i,j-1,grid,grid[i][j],'r',vis) );
        else if (dir=='d')return (trav(i-1,j,grid,grid[i][j],'d',vis) ||trav(i,j+1,grid,grid[i][j],'l',vis) ||trav(i,j-1,grid,grid[i][j],'r',vis) );
        else if(dir=='l')return (trav(i+1,j,grid,grid[i][j],'u',vis) ||trav(i,j+1,grid,grid[i][j],'l',vis) ||trav(i-1,j,grid,grid[i][j],'d',vis) );
        return (trav(i+1,j,grid,grid[i][j],'u',vis) ||trav(i-1,j,grid,grid[i][j],'d',vis) ||trav(i,j-1,grid,grid[i][j],'r',vis) );
    }
}   