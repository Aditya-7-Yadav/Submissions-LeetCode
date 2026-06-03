class Solution {
    public int longestSquareStreak(int[] nums) {
        int n=nums.length;
        int ans=-1;
        Set<Long> hs= new HashSet<>();
        for(int i=0;i<n;i++)hs.add((long)nums[i]);
        for(Long num:hs){
            int temp=1;
            while(hs.contains(num*num)){
                num*=num;
                temp++;
            }
            if(temp>1)ans=Math.max(ans,temp);
        }
        return ans;
    }
}