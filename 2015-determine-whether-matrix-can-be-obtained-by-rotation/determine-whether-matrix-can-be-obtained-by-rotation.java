class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean flag1=true,flag2=true,flag3=true,flag4=true;
        int m=mat.length,n=mat[0].length;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=target[i][j])flag1=false;
                if(mat[n-1-i][n-1-j]!=target[i][j])flag2= false;
                if(mat[j][n-i-1]!=target[i][j])flag3=false;
                if(mat[n-j-1][i]!=target[i][j])flag4=false;
                
            }
        }
        return (flag1 || flag2 || flag3|| flag4);
    }
}