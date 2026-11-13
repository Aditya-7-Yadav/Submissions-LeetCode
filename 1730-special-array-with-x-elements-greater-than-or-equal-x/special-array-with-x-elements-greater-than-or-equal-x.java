class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int ans=1,n=nums.length;
        for(int i=1;i<=n;i++){
            int j=0;
            while(j<n && nums[j]<i)j++;
            if(n-j==i)return i;
        }
        return -1;
    }
}