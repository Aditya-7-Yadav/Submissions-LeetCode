class Solution {
    public String addBinary(String a, String b) {
        if(a.length()<b.length()){
            String c=b;
            b=a;
            a=c;
        }
        char[] ans= new char[a.length()+1];
        int car=0,i=a.length()-1,j=b.length()-1;
        while(j>-1){
            int num=a.charAt(i)-'0'+b.charAt(j)-'0'+car;
            if(num==2){
                ans[i+1]='0';
                car=1;
            }
            else if(num==1){
                ans[i+1]='1';
                car=0;
            }
            else if(num==3){
                ans[i+1]='1';
                car=1;
            }
            else ans[i+1]='0';
            i--;
            j--;
        }
        while(i>-1){
            int num=a.charAt(i)-'0'+car;
            if(num==2){
                ans[i+1]='0';
                car=1;
            }
            else if(num==1){
                ans[i+1]='1';
                car=0;
            }
            else ans[i+1]='0';
            i--;
        }
        if(car==1)ans[0]='1';
        else return new String(ans).substring(1);
        return new String(ans);
    }
}