class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] freq=new int[50001];
        int ans=-1,maxx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                freq[(nums[i]/2)]++;
                if(maxx<freq[nums[i]/2]){
                    maxx=freq[nums[i]/2];
                    ans=nums[i];
                }
                else if(maxx==freq[nums[i]/2]){
                    ans=Math.min(ans,nums[i]);
                }
            }
        }
        return ans;
    }
}