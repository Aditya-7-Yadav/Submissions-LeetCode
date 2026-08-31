class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        double ans=0.0d;
        if(k==0){
            if(row<n && column<n)return 1;
            return 0;
        }
        double[][][] dp= new double[k+2][n][n];
        for(int i=0;i<n;i++)Arrays.fill(dp[1][i],1.0d);
        int kk=k;
        k=2;
        while(k<=kk+1){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
            double ur=0,ul=0,ru=0,rd=0,dr=0,dl=0,lu=0,ld=0;
            if(i>1 && j>0)ur=dp[k-1][i-2][j-1];
            if(i>1 && j<n-1)ul= dp[k-1][i-2][j+1];
            if(i>0 && j<n-2)ru=dp[k-1][i-1][j+2];
            if(i<n-1 && j<n-2)rd= dp[k-1][i+1][j+2];
            if(i<n-2 && j<n-1)dr=dp[k-1][i+2][j+1];
            if(i<n-2 && j>0)dl=dp[k-1][i+2][j-1];
            if(j>1 && i>0) lu=dp[k-1][i-1][j-2];
            if(j>1 && i<n-1)ld= dp[k-1][i+1][j-2];
            dp[k][i][j]=(ur+ul+ru+rd+dr+dl+lu+ld)/8;
                }
            }
            k++;
        }
        return dp[kk+1][row][column];
    }
}