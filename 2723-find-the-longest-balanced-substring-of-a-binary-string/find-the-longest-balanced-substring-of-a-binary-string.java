class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int left=0,right=0,one=0,zero=0,ans=0;
        while(right<s.length()){
            char c=s.charAt(right);
            if(c=='1')one++;
            else zero++;
            
            ans=Math.max(ans,2*Math.min(zero,one));
            if(right<s.length()-1 && c=='1' && s.charAt(right+1)=='0'){
                one=0;
                zero=0;

            }
            right++;
        }
        return ans;
    }
}