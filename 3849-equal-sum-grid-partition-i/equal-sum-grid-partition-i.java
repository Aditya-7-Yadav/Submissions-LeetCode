class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int[] rowsum = new int[grid.length];
        int[] colsum= new int[grid[0].length];
        int m=grid.length,n=grid[0].length;
        long total=0;
        for(int i=0;i<m;i++){
            long sum=0;
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
                total+=grid[i][j];
            }
            rowsum[i]=(int)sum;
        }
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=0;j<m;j++){
                sum+=grid[j][i];
            }
            colsum[i]=(int)sum;
        }
        long temp=0;
        for(int i=0;i<m;i++){
            temp+=rowsum[i];
            if(temp==total-temp) return true;
        }
        temp=0;
        for(int i=0;i<n;i++){
            temp+=colsum[i];
            if(temp==total-temp)return true;
        }
        return false;
    }
}