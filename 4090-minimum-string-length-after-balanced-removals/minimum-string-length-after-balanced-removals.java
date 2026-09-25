class Solution {
    public int minLengthAfterRemovals(String s) {
        int a=0,b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')a++;
            else b++;
        }
        if(a==0)return b;
        if(b==0)return a;
        return Math.abs(a-b);
    }
}