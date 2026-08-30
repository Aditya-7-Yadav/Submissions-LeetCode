class Solution {
    public int minimumDeletions(int[] nums) {
        int ind1=-1,sm=Integer.MAX_VALUE,ind2=-1,lg=Integer.MIN_VALUE,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<sm){
                ind1=i;
                sm=nums[i];
            }
            if(nums[i]>lg){
                ind2=i;
                lg=nums[i];
            }
        }
        int fr= Math.min(ind1,ind2), bc= Math.max(ind1,ind2);
        int ans=fr+1 + n-bc;
        if(bc+1<ans)ans= bc+1;
        if(n-fr<ans)ans= n-fr;
        return ans;
    }
}