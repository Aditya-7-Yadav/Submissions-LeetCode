class Solution {
    public String longestPalindrome(String s) {
        int ans=0,n=s.length(),ll=0,rr=0;
        for(int i=0;i<n;i++){
            int l=i,r=i;
            while(l>-1 && r<n && s.charAt(l)==s.charAt(r)){
                if(ans<r-l+1){
                    ll=l;
                    rr=r;
                    ans=r-l+1;
                }
                l--;
                r++;
                
            }
            l=i;r=i+1;
            while(l>-1 && r<n && s.charAt(l)==s.charAt(r)){
                if(ans<r-l+1){
                    ll=l;
                    rr=r;
                    ans=r-l+1;
                }
                l--;
                r++;
            }
        }
        return s.substring(ll,rr+1);
    }
}