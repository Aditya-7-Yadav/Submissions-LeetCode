class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length,n=grid[0].length;
        k=k%(m*n);
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(grid[i][j]);
            }
            ans.add(row);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int col= ((i+(k/n)) + (j+ k%n)/n)%m, row= (j+ k%n)%n;
                ans.get(col).set(row,grid[i][j]);
            }
        }
        return ans;
    }
}