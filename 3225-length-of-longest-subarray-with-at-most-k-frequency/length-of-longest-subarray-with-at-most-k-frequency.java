class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left=0,right=0,ans=0,n=nums.length;
        HashMap<Integer,Integer> hm= new HashMap<>();
        while(right<n){
            int val= hm.getOrDefault(nums[right],0);
            hm.put(nums[right],++val);
            while(left<=right && val>k){
                hm.put(nums[left],hm.get(nums[left])-1);
                if(nums[left]==nums[right])val--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}