class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m=grid.length,n=grid[0].length;
        int[][] ans=new int[m-k+1][n-k+1];
        for(int i=0;i<m-k+1;i++){
            for(int j=0;j<n-k+1;j++){
                int temp=Integer.MAX_VALUE;
                for(int a=0;a<k;a++){
                    for(int b=0;b<k;b++){
                        for(int c=0;c<k;c++){
                            for(int d=0;d<k;d++){
                                if(a==c && b==d) continue;
                                if((grid[(a+i)][b+j])!=(grid[c+i][d+j]))temp=Math.min(temp,Math.abs((grid[(a+i)][b+j])-(grid[c+i][d+j])));
                            }
                        }
                    }
                }
                if(temp==Integer.MAX_VALUE)continue;
                ans[i][j]=temp;
            }

        }
        return ans;
    }
}