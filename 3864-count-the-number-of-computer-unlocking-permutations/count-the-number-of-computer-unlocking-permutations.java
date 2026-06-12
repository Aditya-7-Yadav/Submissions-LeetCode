class Solution {
    public int countPermutations(int[] nums) {
        long ans=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[0])return 0;
        }
        int n=nums.length-1;
        while(n>0){
            ans=(ans*n)%1000000007;
            n--;
        }
        return (int)ans;
    }
}