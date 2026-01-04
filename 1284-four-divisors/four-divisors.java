class Solution {
    public int sumFourDivisors(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=calc(nums[i]);
        }
        return (int)ans;
    }
    public long calc(int n){
        long cnt=0,ans=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                int j=n/i;
                if(i==j){
                    cnt+=1;
                    ans+=i;
                }else{
                    cnt+=2;
                    ans+=i+j;
                }
            }
        }
        if(cnt==4)return ans;
        return 0;
    }
}