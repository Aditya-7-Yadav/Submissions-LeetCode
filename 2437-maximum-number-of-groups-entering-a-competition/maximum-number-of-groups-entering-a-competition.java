class Solution {
    public int maximumGroups(int[] nums) {
        Arrays.sort(nums);
        int i=0,n=nums.length,ans=0,sum=0,sz=0;
        while(i<n){
            int csum=0,csz=0;
            while(i<n && (csz<=sz || sum>csum)){
                csum+=nums[i++];
                csz++;
            }
            if(csum>sum && csz>sz){
                sum=csum;
                sz=csz;
                ans++;
            }
        }
        return ans;
    }
}