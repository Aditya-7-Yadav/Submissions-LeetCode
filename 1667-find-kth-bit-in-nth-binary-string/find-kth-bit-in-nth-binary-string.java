class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb= new StringBuilder("0");
        while(n>0){
            
            sb.append("1");
            int i=0;
            int ss=sb.length();
            while(i<ss-1){
                if(sb.charAt(ss-2-i)=='0')sb.append("1");
                else sb.append("0");
                i++;
            }
            n--;
        }
        return sb.charAt(k-1);
    }
}