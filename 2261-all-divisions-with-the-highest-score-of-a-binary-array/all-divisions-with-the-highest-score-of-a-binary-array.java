class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        int o=0,z=0;
        for(int i=0;i<nums.length;i++)if(nums[i]==0)z++;else o++;
        int high=o;
        List<Integer> ans= new ArrayList<>();
        ans.add(0);
        int co=0,cz=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)cz++;
            else co++;
            if((o-co+cz)>high){
                high=o-co+cz;
                ans.clear();
                ans.add(i+1);
            }
            else if((o-co+cz)==high){
                ans.add(i+1);
            }
        }
        
        return ans;
    }
}