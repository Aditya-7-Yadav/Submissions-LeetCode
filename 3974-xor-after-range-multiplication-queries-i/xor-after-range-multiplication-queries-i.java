class Solution {
    public int xorAfterQueries(int[] nums, int[][] q) {
        long ans=0;
        for(int i=0;i<q.length;i++){
            for(int j=q[i][0];j<=q[i][1];j+=q[i][2]){
                nums[j]=(int)((nums[j]*(long)q[i][3])%1000000007L);
            }
        }
        for(int i=0;i<nums.length;i++)ans^=nums[i];
        return (int)ans;
    }
}