class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length,temp=0,found=0;
        boolean[] arr= new boolean[n];
        for(int i=0;i<n;i++){
            if(nums[i]>=n)return false;
            if(nums[i]==n-1){
                if(found==2)return false;
                found++;
                arr[nums[i]]=true;
                temp++;
                continue;
            }
            if(!arr[nums[i]]){
                arr[nums[i]]=true;
                temp++;
            }
            else return false;
        }
        return temp==n;
    }
}