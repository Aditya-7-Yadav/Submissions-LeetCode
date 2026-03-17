class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length,ans=0;

        for(int j=0;j<n;j++){
            for(int i=1;i<m;i++){
                if(matrix[i][j]==1) matrix[i][j]+=matrix[i-1][j];
            }
        }

        for(int i=0;i<m;i++){
            int[] temp=matrix[i].clone();
            Arrays.sort(temp);

            for(int j=n-1;j>=0;j--){
                ans=Math.max(ans,temp[j]*(n-j));
            }
        }

        return ans;
    }
}