class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n=nums1.length;
        long k=(long)k1+k2,sum=0;
        int[] diff=new int[n];
        int mx=0;
        for(int i=0;i<n;i++){
            diff[i]=Math.abs(nums1[i]-nums2[i]);
            sum+=diff[i];
            mx=Math.max(mx,diff[i]);
        }
        if(k>=sum)return 0;
        int l=0,r=mx;
        while(l<r){
            int m=l+(r-l)/2;
            long cnt=0;
            for(int d:diff)cnt+=Math.max(0,d-m);
            if(cnt>k)l=m+1;
            else r=m;
        }
        long cnt=0,ans=0;
        for(int d:diff){
            int x=Math.min(d,l);
            cnt+=d-x;
            ans+=(long)x*x;
        }
        for(int i=0;i<n&&cnt<k;i++){
            if(diff[i]>=l&&l>0){
                ans-=(long)l*l;
                ans+=(long)(l-1)*(l-1);
                cnt++;
            }
        }
        return ans;
    }
}