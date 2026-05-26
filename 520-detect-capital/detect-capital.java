class Solution {
    public boolean detectCapitalUse(String w) {
        boolean iscap=Character.isUpperCase(w.charAt(0));
        boolean small=false,big=false;
        for(int i=1;i<w.length();i++){
            char ch=w.charAt(i);
            if(Character.isUpperCase(ch)){
                big=true;
                if(small && big)return false;
                if(small || !iscap)return false;
                
            }
            else small=true;
        }
        if(small && big)return false;

        return true;
    }
}