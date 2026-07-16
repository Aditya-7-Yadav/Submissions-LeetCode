class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length,mx=0;
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            mx=Math.max(mx,nums[i]);
            arr[i]=gcd(mx,nums[i]);
        }
        long ans=0;
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++){
            ans+=gcd(arr[i],arr[n-i-1]);
        }
        
        return ans;
    }
        static int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
}