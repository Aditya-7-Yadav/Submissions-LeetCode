class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] q, int x) {
        List<Integer> al= new ArrayList<>();
        int n=nums.length,m=q.length;
        al.add(0);
        int[] ans=new int[m];
        for(int i=0;i<n;i++){
            if(nums[i]==x)al.add(i);
        }
        for(int i=0;i<m;i++){
            if(q[i]>=al.size())ans[i]=-1;
            else ans[i]=al.get(q[i]);
        }
        return ans;
    }
}