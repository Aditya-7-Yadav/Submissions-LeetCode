class Solution {
    public int furthestDistanceFromOrigin(String mov) {
        int l=0,r=0,o=0;
        for(int i=0;i<mov.length();i++){
            if(mov.charAt(i)=='L')l++;
            else if(mov.charAt(i)=='R')r++;
            else o++;
        }
        return Math.max(l,r)-Math.min(l,r)+o;
    }
}