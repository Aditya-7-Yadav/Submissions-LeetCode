class Solution {
    public int maximumLengthSubstring(String s) {
        int[] f= new int[26];
        int left=0,right=0,n=s.length(),ans=0;
        while(right<n){
            char ch=s.charAt(right);
            f[ch-'a']++;
            while(left<=right && f[ch-'a']>2){
                char ch2=s.charAt(left);
                f[ch2-'a']--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}