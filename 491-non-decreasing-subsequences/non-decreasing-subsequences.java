class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        trav(0,nums,ans,new ArrayList<>());
        return ans;
    }

    public void trav(int start,int[] nums,ArrayList<List<Integer>> ans,ArrayList<Integer> temp){

        if(temp.size()>1)
            ans.add(new ArrayList<>(temp));

        HashSet<Integer> used=new HashSet<>();

        for(int i=start;i<nums.length;i++){
            if(used.contains(nums[i]))continue;

            if(temp.size()==0||nums[i]>=temp.get(temp.size()-1)){
                used.add(nums[i]);
                temp.add(nums[i]);
                trav(i+1,nums,ans,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}