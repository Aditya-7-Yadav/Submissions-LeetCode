class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] pr=new int[n];
        pr[0]=nums[0];
        int[] nx= new int[n];
        nx[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            pr[i]=nums[i]*pr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            nx[i]=nums[i]*nx[i+1];
        }

        int[] ans= new int[n];
        ans[0]=nx[1];
        ans[n-1]=pr[n-2];
        for(int i=1;i<n-1;i++){
            ans[i]=pr[i-1]*nx[i+1];      
              }
              return ans;
    }
}