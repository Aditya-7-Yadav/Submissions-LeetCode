class Solution {
    public int maxDigitRange(int[] nums) {
        int ans=0,curr=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i],dr=0,minn=9,maxx=-1;
            while(n>0){
                int temp=n%10;
                n/=10;
                minn=Math.min(minn,temp);
                maxx=Math.max(maxx,temp);
            }
            dr=maxx-minn;
            if(curr==dr){
                ans+=nums[i];
            }
            else if(curr<dr){
                curr=dr;
                ans=nums[i];
            }
        }
        return ans;
    }
}