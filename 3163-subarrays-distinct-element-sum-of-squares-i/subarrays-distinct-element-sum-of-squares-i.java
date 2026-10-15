class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            Set<Integer> hs= new HashSet<>();
            for(int j=i;j<nums.size();j++){
                hs.add(nums.get(j));
                int temp=hs.size();
            ans+=temp*temp;
            }   
        }
        return ans;
    }
}