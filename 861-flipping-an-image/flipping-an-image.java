class Solution {
    public int[][] flipAndInvertImage(int[][] img) {
        int m=img.length,n=img[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<=n/2;j++){
                if(n%2==0 && j==n/2)break;
                int temp= -1*(img[i][j] -1);
                img[i][j]=-1*(img[i][n-j-1] -1 );
                img[i][n-j-1]=temp;
            }
        }
        return img;
    }
}