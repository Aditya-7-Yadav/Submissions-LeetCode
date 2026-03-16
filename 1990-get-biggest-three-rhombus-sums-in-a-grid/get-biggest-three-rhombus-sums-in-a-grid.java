class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int[] ans= new int[3];
        int m=grid.length, n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int temp=0;
                while(i+temp<m && i-temp>-1 && j-temp>-1 && j+temp<n){
                    int curr=grid[i][j];
                    if(temp>0){
                        curr=0;
                        for(int k=0;k<temp;k++){
                            curr+=grid[i-temp+k][j+k];
                            curr+=grid[i+k][j+temp-k];
                            curr+=grid[i+temp-k][j-k];
                            curr+=grid[i-k][j-temp+k];
                        }
                    }
                    if(curr==ans[0] || curr==ans[1] || curr==ans[2]){
                        temp++;
                        continue;
                    }
                    if(curr>=ans[0]){
                        ans[2]=ans[1];
                        ans[1]=ans[0];
                        ans[0]=curr;
                    }
                    else if(curr>=ans[1]){
                        ans[2]=ans[1];
                        ans[1]=curr;
                    }
                    else if(curr>ans[2])ans[2]=curr;
                    temp++;
                }
            }
        }
        int sz=0;
        if(ans[1]==0)sz++;
        if(ans[2]==0)sz++;
        return Arrays.copyOf(ans,3-sz);
    }
}