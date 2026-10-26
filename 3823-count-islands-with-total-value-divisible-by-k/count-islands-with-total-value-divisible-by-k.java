class Solution {
    public int countIslands(int[][] grid, int k) {
        int ans=0;
        boolean[][] temp=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!temp[i][j] && grid[i][j]!=0){
                    long sum=trav(i,j,grid,temp,0);
                    if(sum%k==0)ans++;
                }
            }
        }
        return ans;
    } 

    public long trav(int i,int j,int[][] nums,boolean[][] temp,long sum){
        if(i<0 || j<0 || i>=nums.length || j>=nums[0].length) return 0;
        if(temp[i][j] || nums[i][j]==0) return 0;
        temp[i][j]=true;
        sum=nums[i][j];
        sum+=trav(i+1,j,nums,temp,0);
        sum+=trav(i-1,j,nums,temp,0);
        sum+=trav(i,j+1,nums,temp,0);
        sum+=trav(i,j-1,nums,temp,0);
        return sum;
    }
}
