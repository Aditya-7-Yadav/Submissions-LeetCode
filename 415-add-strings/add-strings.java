class Solution {
    public String addStrings(String num1, String num2) {
        int car=0,n=num1.length(),m=num2.length();
        int i=n-1,j=m-1;
        StringBuilder sb=new StringBuilder();
        while(i>-1 && j>-1){
            char c1=num1.charAt(i),c2=num2.charAt(j);
            int n1= c1-'0',n2=c2-'0';
            int sum=n1+n2+car;
            if(sum>=10){
                car=1;
                sum-=10;
            }
            else car=0;
            sb.append(sum+"");
            i--;
            j--;
        }
        while(i>-1){
            char c1=num1.charAt(i);
            int n1=c1-'0';
            int sum=n1+car;
            
            if(sum>=10){
                car=1;
                sum-=10;
            }
            else car=0;
            sb.append(sum+"");
            i--;
        }
        while(j>-1){
            char c1=num2.charAt(j);
            int n1=c1-'0';
            int sum=n1+car;
            if(sum>=10){
                car=1;
                sum-=10;
            }
            else car=0;
            sb.append(sum+"");
            j--;
        }
        if(car==1)sb.append("1");
        return sb.reverse().toString();
    }
}