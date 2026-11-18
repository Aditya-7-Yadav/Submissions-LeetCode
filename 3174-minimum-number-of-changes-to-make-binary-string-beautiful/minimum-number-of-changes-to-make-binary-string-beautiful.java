class Solution {
    public int minChanges(String s) {
        int ans=0,n=s.length();
        for(int i=1;i<n;i+=2)if(s.charAt(i-1)!=s.charAt(i))ans++;
        return ans;
    }
}