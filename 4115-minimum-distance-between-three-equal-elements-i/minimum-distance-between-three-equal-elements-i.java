class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,Integer> hm1 = new HashMap<>();
        Map<Integer,Integer> hm2 = new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(hm1.containsKey(nums[i]) && hm2.containsKey(nums[i])){
                ans=Math.min(ans,i-hm1.get(nums[i])+i-hm2.get(nums[i])+hm2.get(nums[i])-hm1.get(nums[i]));
                hm1.put(nums[i],hm2.get(nums[i]));
                hm2.put(nums[i],i);
            }
            else if(hm1.containsKey(nums[i]))hm2.put(nums[i],i);
            else hm1.put(nums[i],i);
        }
        if(ans==Integer.MAX_VALUE)return -1;
        return ans;
    }
}