class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        long ans=0;
        int n=nums1.length,currdiff=0,curri=-1;
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=nums1[i];
            ans+=Math.abs((long)nums1[i]-nums2[i]);
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int num=find(nums2[i],nums);
            int diff=(int)Math.abs((long)nums2[i]-num);
            if(diff<Math.abs((long)nums2[i]-nums1[i])&& Math.abs((long)nums2[i]-nums1[i]) -diff>currdiff){
                currdiff=(int)Math.abs((long)nums2[i]-nums1[i])-diff;
                curri=i;
            }
        }
        if(curri!=-1){
            //ans-=Math.abs((long)nums1[curri]-nums2[curri]);
            ans-=currdiff;
        }
        return (int)(ans%1000000007);
    }
    public int find(int target,int[] nums) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target)return nums[m];
            if(nums[m]<target)l=m+1;
            else r=m-1;
        }
        if(l==nums.length)return nums[r];
        if(r<0)return nums[l];
        return Math.abs((long)nums[l]-target)<Math.abs((long)nums[r]-target)?nums[l]:nums[r];
    }
}