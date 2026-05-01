class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        int ans=0,ptr=n-1,temp=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            temp+=i*nums[i];
        }
        ans=temp;
        while(ptr>-1){
            temp= temp + sum-nums[ptr] - (nums[ptr]*(n-1));
            ans=Math.max(ans,temp);
            ptr--;
        }
        return ans;
    }
}