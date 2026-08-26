class Solution {
    public int minimumSubarrayLength(int[] nums, int kk) {
        int sz=999,n=nums.length,curr=99999;
        for(int i=0;i<n;i++){
            int tempp=nums[i];
            if(tempp>=kk)return 1;
            for(int j=1+i;j<n;j++){
                int temp=0;
                for(int k=i;k<=j;k++)
                temp |= nums[k];
                if(temp>=kk){
                    sz=Math.min(sz,j-i+1);
                }
            }
        }
        if(sz==999)return -1;
        return sz;
    }
}