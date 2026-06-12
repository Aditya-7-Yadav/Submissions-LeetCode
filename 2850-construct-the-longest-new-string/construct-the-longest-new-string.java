class Solution {
    public int longestString(int x, int y, int z) {
        int minn=Math.min(x,y),maxx=Math.max(x,y);
        int ans=minn*2;
        if(maxx>minn)ans++;
        ans+=z;
        return ans*2;
    }
}