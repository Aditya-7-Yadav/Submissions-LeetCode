class Solution {
    public boolean areSimilar(int[][] nums, int k) {
        int m=nums.length,n=nums[0].length;
        k=k%n;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i%2==1){
                    if(nums[i][j]!=nums[i][(j+k)%n])return false;
                }
                else{
                    int kk=j-k;
                    if(kk<0)kk=n+kk;
                    if(nums[i][j]!=nums[i][kk])return false;
                }
            }
        }
        return true;
    }
}