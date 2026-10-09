class Solution {
    public int minInsertions(String s) {
        int ans=0,st=0,n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st++;
            }
            else{
                if(i+1<n && s.charAt(i+1)==')'){
                    i++;
                }
                else ans++;
                if(st>0)st--;
                else ans++;
            }
        }
        return ans+st*2;
    }
}