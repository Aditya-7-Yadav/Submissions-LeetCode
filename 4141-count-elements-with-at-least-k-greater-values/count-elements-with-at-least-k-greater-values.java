class Solution {
    public int countElements(int[] nums, int k) {
        int ans=0,dist=0,n=nums.length;
        Arrays.sort(nums);
        for(int i=n-1;i>-1;i--){
            int j=i;
            if(i>0 && nums[i]==nums[i-1]){
                i--;
                if(n-j-1 >=k)ans++;
                while(i>=0 && nums[i]==nums[i+1]){
                if(n-j-1 >=k)ans++;
                i--;
            }
            i++;
            }
            else if(n-j-1 >=k)ans++;
        }
        return ans;
    }
}