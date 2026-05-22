class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int ans=1,curr=0,n=s.length(),j=0;
        for(int i=0;i<n-1;i++){
            char c1=s.charAt(i),c2=s.charAt(i+1);
            if(c1==c2){
                curr++;
            }
            while(j<n-1 && curr>1){
                c1=s.charAt(j);
                c2=s.charAt(j+1);
                if(c1==c2)curr--;
                j++;
            }
            ans=Math.max(ans,i-j+2);
        }
        return ans;
    }
}