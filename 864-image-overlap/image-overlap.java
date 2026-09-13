class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int ans=0;

        for(int dx=-(n-1);dx<n;dx++){
            for(int dy=-(n-1);dy<n;dy++){
                int count=0;

                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        if(img1[i][j]==1){
                            int ni=i+dx;
                            int nj=j+dy;

                            if(ni>=0 && ni<n && nj>=0 && nj<n){
                                if(img2[ni][nj]==1){
                                    count++;
                                }
                            }
                        }
                    }
                }

                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}