class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m=grid.length,n=grid[0].length;
       int[][][] nums=new int[m][n][2]; 
       int ans=0;
       if(grid[0][0]=='X')nums[0][0][0]++;
       else if(grid[0][0]=='Y')nums[0][0][1]++;
       for(int i=1;i<m;i++){
        nums[i][0][0]+=nums[i-1][0][0];
        nums[i][0][1]+=nums[i-1][0][1];
        if(grid[i][0]=='X')nums[i][0][0]++;
       else if(grid[i][0]=='Y')nums[i][0][1]++;
       if(nums[i][0][0]==nums[i][0][1] && nums[i][0][0]!=0)ans++;
       }
       for(int i=1;i<n;i++){
        nums[0][i][0]+=nums[0][i-1][0];
        nums[0][i][1]+=nums[0][i-1][1];
        if(grid[0][i]=='X')nums[0][i][0]++;
       else if(grid[0][i]=='Y')nums[0][i][1]++;
       if(nums[0][i][0]==nums[0][i][1] && nums[0][i][0]!=0)ans++;
       }
       for(int i=1;i<m;i++){
        for(int j=1;j<n;j++){
            nums[i][j][0]=nums[i-1][j][0]+nums[i][j-1][0]-nums[i-1][j-1][0];
            nums[i][j][1]=nums[i-1][j][1]+nums[i][j-1][1]-nums[i-1][j-1][1];
            if(grid[i][j]=='X')nums[i][j][0]++;
       else if(grid[i][j]=='Y')nums[i][j][1]++;
            if(nums[i][j][0]==nums[i][j][1] && nums[i][j][0]>0)ans++;
        }
       }
       return ans;
    }
}