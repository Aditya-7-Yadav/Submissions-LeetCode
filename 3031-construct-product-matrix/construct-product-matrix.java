class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[][] ans= new int[m][n];
        long[] nxt=new long[m*n];
        long[] prv=new long[m*n];
        prv[0]=grid[0][0];
        nxt[(m*n)-1]=grid[m-1][n-1];
        long curr=1;
        for(int i=1;i<m*n;i++){
            int j=(m*n)-1-i;
            prv[i]=(prv[i-1]*grid[i/n][i%n])%12345;
            nxt[j]=(nxt[j+1]*grid[j/n][j%n])%12345;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int k=(i*n)+j;
                if(k==0 || k==(m*n)-1)continue;
                ans[i][j]=(int)(prv[k-1]*nxt[k+1]%12345);
            }
        }
        ans[0][0]=(int)(nxt[1]%12345);
        ans[m-1][n-1]=(int)(prv[(m*n)-2]%12345);
        return ans;
    }
}