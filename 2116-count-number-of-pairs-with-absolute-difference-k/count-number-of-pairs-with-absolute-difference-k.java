class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++)hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        for(int key:hm.keySet()){
    ans+=hm.get(key)*((hm.getOrDefault(Math.abs(key+k),0))+hm.getOrDefault(key-k,0));
}
        return ans/2;
    }
}