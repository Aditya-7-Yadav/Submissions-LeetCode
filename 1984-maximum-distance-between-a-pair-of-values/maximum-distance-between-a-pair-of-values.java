class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i1=nums1.length-1,i2=nums2.length-1,ans=0;
        while(i1>-1 && i2>-1){
            while(i1>0 && nums1[i1-1]<=nums2[i2])i1--;
            if(nums1[i1]<=nums2[i2])ans=Math.max(ans,i2-i1);
            i2--;
        }
        return ans;
    }
}