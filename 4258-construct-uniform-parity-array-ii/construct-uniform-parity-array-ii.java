class Solution {
    public boolean uniformArray(int[] nums) {
        int mine=Integer.MAX_VALUE,maxe=Integer.MIN_VALUE;
        int mino=mine,maxo=maxe;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                mine=Math.min(mine,nums[i]);
                maxe=Math.max(maxe,nums[i]);
            }
            else{
                mino=Math.min(mino,nums[i]);
                maxo=Math.max(maxo,nums[i]);
            }
        }
        int n=nums.length, even=0,odd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                odd++;
                if(nums[i]-mino>=1)even++;
            }
            else{
                even++;
                if(nums[i]-mino>=1)odd++;;
            }
        }
        return (odd==n||n==even);
    }
}