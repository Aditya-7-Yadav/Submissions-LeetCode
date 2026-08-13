class Solution {
    public int countSubstrings(String s) {
        int ans=0,n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int left=i,right=i;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
                ans++;
            }
            if(i>0 && s.charAt(i-1)==ch){
                left=i-1;right=i;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
                ans++;
            }
            }
        }
        return ans;
    }
}