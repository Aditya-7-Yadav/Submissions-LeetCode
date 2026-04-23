class Solution {
    public long[] distance(int[] nums) {
        Map<Integer,Long> hm= new HashMap<>();
        long[] ans= new long[nums.length];
        
        Map<Integer,Long> cnta= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0l)+i);
            cnta.put(nums[i],cnta.getOrDefault(nums[i],0l)+1);
        }
        Map<Integer,Long> hm2= new HashMap<>();
        Map<Integer,Long> cnt= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            long prev=hm2.getOrDefault(nums[i],0l);
            long aft=hm.get(nums[i])-prev-i;
            long cntp=cnt.getOrDefault(nums[i],0l);
            long cntn=cnta.get(nums[i])-cntp-1;
            ans[i] = (i*cntp)-(prev) + (aft)-(i*cntn);
            cnt.put(nums[i],cnt.getOrDefault(nums[i],0l)+1);
            hm2.put(nums[i],hm2.getOrDefault(nums[i],0l)+i);
        }
        return ans;
    }
}