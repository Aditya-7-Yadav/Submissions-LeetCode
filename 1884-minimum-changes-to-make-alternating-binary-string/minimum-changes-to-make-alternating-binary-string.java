class Solution {
    public int minOperations(String s) {
        int oo=0,oz=0,eo=0,ez=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(i%2==0)eo++;
                else oo++;
            }
            else{
                 if(i%2==0)ez++;
                else oz++;
            }
        }
        return s.length()-Math.max((oz+eo),(ez+oo));
    }
}