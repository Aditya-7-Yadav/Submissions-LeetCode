class Solution {
    public int maxDepth(String s) {
        int ans=0,temp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') temp++;
            else if (s.charAt(i)==')') temp--;
            ans= Math.max(temp,ans);
        }
        return ans;
    }
}