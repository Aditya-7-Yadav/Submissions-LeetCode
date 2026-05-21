class Solution {
    public int longestCommonPrefix(int[] nums1, int[] nums2) {
        HashSet<Integer> hm= new HashSet<>();
        int ans=0;
        for(int i=0;i<nums1.length;i++){
            int n=nums1[i];
            while(!hm.contains(n) && n>0){
                hm.add(n);
                n/=10;
            }
        }
        for(int i=0;i<nums2.length;i++){
            int n=nums2[i];
            int sz=(int)Math.log10(n)+1;
            if(sz>ans){
                while(n>0){
                    if(hm.contains(n)){
                        ans=Math.max(ans,sz);
                        break;
                    }
                    n/=10;
                    sz--;
                }
            }
        }
        return ans;
    }
}