class Solution {
    public int minEatingSpeed(int[] nums,long k) {
        long ans=0,low=1,high=0;

        for(int i=0;i<nums.length;i++) high=Math.max(high,nums[i]);

        while(low<=high){
            long mid=(low+high)/2;
            long req=time(nums,mid);

            if(req>k) low=mid+1;
            else{
                ans=mid;
                high=mid-1;
            }
        }

        return (int)ans;
    }

    public long time(int[] nums,long k){
        long temp=0;

        for(int i=0;i<nums.length;i++){
            temp+=nums[i]/k;
            if(nums[i]%k!=0) temp++;
        }

        return temp;
    }
}