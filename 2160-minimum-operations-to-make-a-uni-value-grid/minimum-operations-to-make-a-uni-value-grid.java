class Solution {
    public int minOperations(int[][] grid, int x) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(j<grid[i].length-1 && grid[i][j]%x != grid[i][j+1]%x) return -1;
                if(grid[i][j]>max) max=grid[i][j];
                 if(grid[i][j]<min) min=grid[i][j];
            }
            if(i<grid.length-1 && grid[i][grid[i].length-1]%x!=grid[i+1][0]%x) return -1;
        }
        int[] arr= new int[grid.length * grid[0].length];
        int average=(min+max)/2,a=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                arr[a++]=grid[i][j];
                
            }
            }
        Arrays.sort(arr);
        int avg=arr[arr.length/2];
            int ans=0;
             for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                ans+=Math.abs(grid[i][j]-avg)/x;
            }
             }
            

        return ans;
    }
}