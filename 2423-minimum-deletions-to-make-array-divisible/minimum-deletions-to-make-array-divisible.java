class Solution {
    public int minOperations(int[] nums, int[] arr) {
        int hcf=arr[0];

        for(int i=1;i<arr.length;i++){
            int a=hcf,b=arr[i];
            while(b!=0){
                int t=a%b;
                a=b;
                b=t;
            }
            hcf=a;
        }
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length && hcf%nums[i]!=0;i++){
            ans++;
        }
        if(ans>=nums.length)return -1;
        return ans;
    }
}