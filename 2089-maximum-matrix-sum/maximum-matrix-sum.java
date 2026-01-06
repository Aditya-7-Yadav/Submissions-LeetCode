class Solution {
    public long maxMatrixSum(int[][] mat) {
        long ans=0;
        int n=mat.length, neg=0;
        int minn=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]<=0){                
                neg++;
                }
                minn=Math.min(minn,Math.abs(mat[i][j]));
                ans+=Math.abs(mat[i][j]);
            }
        }
        if(neg%2==0 || minn==0) return ans;
        return ans-2L*minn;
    }
}