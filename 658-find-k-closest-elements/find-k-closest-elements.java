class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        List<Integer> ans= new ArrayList<>();
        int i=0,n=nums.length;
        while(i<n && nums[i]<x)i++;
        int j=i-1;
        while(k>0){
            int prev=99999,nxt=99999;
            if(j>-1)prev=nums[j];
            if(i<n)nxt=nums[i];
            if(Math.abs(x-prev)<=Math.abs(x-nxt)){
                ans.add(nums[j]);
                j--;
            }
            else{
                ans.add(nums[i]);
                i++;
            }
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
}