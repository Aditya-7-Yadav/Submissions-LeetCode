class Solution {
    public boolean isNumber(String s) {
        int n=s.length();
        boolean pnt=false,e=false,dig=false;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(ch=='-' || ch=='+'){
                if((i>0 && !(s.charAt(i-1)=='e' || s.charAt(i-1)=='E')) || i==n-1)
                    return false;
            }
            else if(ch=='e' || ch=='E'){
                if(i==0 || i==n-1 || e || !dig)
                    return false;

                e=true;
                dig=false;
            }
            else if(ch=='.'){
                if(e || pnt)
                    return false;

                pnt=true;
            }
            else if(Character.isDigit(ch)){
                dig=true;
            }
            else{
                return false;
            }
        }
        return dig;
    }
}