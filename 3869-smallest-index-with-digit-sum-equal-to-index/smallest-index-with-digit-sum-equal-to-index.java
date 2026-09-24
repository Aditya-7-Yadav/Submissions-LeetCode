class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=0;
            while(nums[i]>0){
                num+= nums[i]%10;
                nums[i]/=10;
            }
            if(num==i)return i;
        }
        return -1;
    }
}