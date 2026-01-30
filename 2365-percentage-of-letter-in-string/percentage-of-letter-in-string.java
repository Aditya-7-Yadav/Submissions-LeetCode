class Solution {
    public int percentageLetter(String s, char letter) {
        int f=0;
        for(int i=0;i<s.length();i++)if(s.charAt(i)==letter)f++;
        float ans=(100*f/s.length());
        return (int)ans;
    }
}