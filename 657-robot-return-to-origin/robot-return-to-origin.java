class Solution {
    public boolean judgeCircle(String moves) {
        char[] c= moves.toCharArray();
        int r=0,l=0,u=0,d=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='R') r++;
            else if(c[i]=='L') l++;
            else if(c[i]=='U') u++;
            else d++;
        }
        if(r==l && u==d) return true;
    
    return false;
    }
}