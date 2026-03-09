class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int temp=0,n=grid.length,i=0,j=0;
        if(grid[0][0]!=0)return false;
        while(i>=0 && j>=0 && i<n && j<n && temp+1<n*n){
            if(i-2>-1 && j-1>-1 && grid[i-2][j-1]==temp+1){
                i-=2;
                j--;
                temp++;
            }
            else if(i-2>-1 && j+1<n && grid[i-2][j+1]==temp+1){
                i-=2;
                j++;
                temp++;
            }
            else if(i+2<n && j-1>-1 && grid[i+2][j-1]==temp+1){
                i+=2;
                j--;
                temp++;
            }
            else if(i+2<n && j+1<n && grid[i+2][j+1]==temp+1){
                i+=2;
                j++;
                temp++;
            }
            else if(j+2<n && i-1>-1 && grid[i-1][j+2]==temp+1){
                j+=2;
                i--;
                temp++;
            }
            else if(j+2<n && i+1<n && grid[i+1][j+2]==temp+1){
                j+=2;
                i++;
                temp++;
            }
            else if(j-2>-1 && i-1>-1 && grid[i-1][j-2]==temp+1){
                j-=2;
                i--;
                temp++;
            }
            else if(j-2>-1 && i+1<n && grid[i+1][j-2]==temp+1){
                j-=2;
                i++;
                temp++;
            }
            else return false;
        }
        return true;
    }
}