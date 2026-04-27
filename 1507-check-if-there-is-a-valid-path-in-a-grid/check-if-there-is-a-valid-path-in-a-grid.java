class Solution {
    int m,n;
    boolean[][] vis;
    
    public boolean hasValidPath(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        vis=new boolean[m][n];
        return dfs(0,0,grid);
    }
    
    boolean dfs(int i,int j,int[][] grid){
        if(i<0||j<0||i>=m||j>=n||vis[i][j]) return false;
        if(i==m-1 && j==n-1) return true;
        
        vis[i][j]=true;
        
        int val=grid[i][j];
        
        if(val==1){
            if(valid(i,j,i,j-1,grid) && dfs(i,j-1,grid)) return true;
            if(valid(i,j,i,j+1,grid) && dfs(i,j+1,grid)) return true;
        }
        else if(val==2){
            if(valid(i,j,i-1,j,grid) && dfs(i-1,j,grid)) return true;
            if(valid(i,j,i+1,j,grid) && dfs(i+1,j,grid)) return true;
        }
        else if(val==3){
            if(valid(i,j,i,j-1,grid) && dfs(i,j-1,grid)) return true;
            if(valid(i,j,i+1,j,grid) && dfs(i+1,j,grid)) return true;
        }
        else if(val==4){
            if(valid(i,j,i,j+1,grid) && dfs(i,j+1,grid)) return true;
            if(valid(i,j,i+1,j,grid) && dfs(i+1,j,grid)) return true;
        }
        else if(val==5){
            if(valid(i,j,i,j-1,grid) && dfs(i,j-1,grid)) return true;
            if(valid(i,j,i-1,j,grid) && dfs(i-1,j,grid)) return true;
        }
        else if(val==6){
            if(valid(i,j,i,j+1,grid) && dfs(i,j+1,grid)) return true;
            if(valid(i,j,i-1,j,grid) && dfs(i-1,j,grid)) return true;
        }
        return false;
    }
    
    boolean valid(int i,int j,int ni,int nj,int[][] grid){
        if(ni<0||nj<0||ni>=m||nj>=n) return false;       
        int next=grid[ni][nj];        
        if(ni==i && nj==j-1) return next==1||next==4||next==6;
        if(ni==i && nj==j+1) return next==1||next==3||next==5;
        if(ni==i-1 && nj==j) return next==2||next==3||next==4;
        if(ni==i+1 && nj==j) return next==2||next==5||next==6;
        return false;
    }
}