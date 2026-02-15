class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans=0,sum=0;
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<k;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
        }
        if(hm.size()==k)ans=Math.max(ans,sum);
        for(int i=k;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
            hm.put(nums[i-k],hm.getOrDefault(nums[i-k],0)-1);
            if(hm.get(nums[i-k])<=0)hm.remove(nums[i-k]);
            sum-=nums[i-k];
            if(hm.size()==k)ans=Math.max(ans,sum);
        }
        return ans;
    }
}