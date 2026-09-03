class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;
        long ans=(long)n*(n-1)/2;
        for(int i=0;i<n;i++){
            nums[i]-=i;
        }
        Map<Integer,Long> hm= new HashMap<>();
        for(int i=n-1;i>-1;i--){
            long temp= hm.getOrDefault(nums[i],0L);
            ans-=temp;
            hm.put(nums[i],temp+1);
        }
        return ans;
    }
}