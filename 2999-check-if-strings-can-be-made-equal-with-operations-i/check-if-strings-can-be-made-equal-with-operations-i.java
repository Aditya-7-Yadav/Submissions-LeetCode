class Solution {
    public boolean canBeEqual(String s1, String s2) {
        boolean temp1=false,temp2=false;
            if(s1.charAt(0)==s2.charAt(0)){}
            else if(s1.charAt(0)==s2.charAt(2)){
                if(s2.charAt(0)!=s1.charAt(2))return false;
                temp1=true;
            }
            else return false;
            if(s1.charAt(1)==s2.charAt(1)){}
            else if(s1.charAt(1)==s2.charAt(3)){
                if(s2.charAt(1)!=s1.charAt(3))return false;
                temp2=true;
            }
            else return false;
            if(temp1){
                if(s2.charAt(2)!=s1.charAt(0)) return false;
            }
            else{
                if(s2.charAt(2)!=s1.charAt(2)) return false;
            }

            if(temp2){
                if(s2.charAt(3)!=s1.charAt(1)) return false;
            }
            else{
                if(s2.charAt(3)!=s1.charAt(3)) return false;
            }

            return true;
    }
}