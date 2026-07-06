class Solution {
    public int removeCoveredIntervals(int[][] nums) {
        Arrays.sort(nums,(a,b)->{
    if(a[0]!=b[0])return Integer.compare(a[0],b[0]);
    return Integer.compare(b[1],a[1]);
});
        int ans=0,n=nums.length,curr=nums[0][1];
        for(int i=1;i<n;i++){
            if(nums[i][1]<=curr){
                ans++;
            }
            else curr=nums[i][1];
        }
        return n-ans;
    }
}