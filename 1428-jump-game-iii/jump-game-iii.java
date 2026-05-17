class Solution {
    public boolean canReach(int[] nums, int st) {
        int n=nums.length;
        boolean[] vis= new boolean[n];
        return trav(nums,vis,st);
    }
    public boolean trav(int[] nums,boolean[] vis,int i){
        int n=nums.length;
        if(i<0 || i>=n)return false;
        if(nums[i]==0)return true;
        if(vis[i])return false;
        vis[i]=true;
        return (trav(nums,vis,i+nums[i])||trav(nums,vis,i-nums[i]));
    }
}