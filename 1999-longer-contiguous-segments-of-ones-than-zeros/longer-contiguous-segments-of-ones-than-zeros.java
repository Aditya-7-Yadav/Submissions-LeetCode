class Solution {
    public boolean checkZeroOnes(String s) {
        if(s.length()==1)return s.charAt(0)=='1';
        int lo=0,lz=0;
        for(int i=0;i<s.length();i++){
            int tempo=0,tempz=0;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1) && s.charAt(i)=='0'){
                tempz++;
                i++;
            }
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1) && s.charAt(i)=='1'){
                tempo++;
                i++;
            }
            lo=Math.max(lo,tempo);
            lz=Math.max(lz,tempz);
        }
        return lz<lo;
    }
}