class Solution {
    public int bestClosingTime(String cust) {
        int y=0,n=0;
        for(int i=0;i<cust.length();i++){
            if(cust.charAt(i)=='Y')y++;
            else n++;
        }
        int ans=y,max=y,ind=0;
        for(int i=0;i<cust.length();i++){
            if(max<ans){
                ans=max;
                ind=i;

            }
            if(cust.charAt(i)=='Y')max--;
            else max++;           
        }
        if(max<ans){
                ans=max;
                ind=cust.length();
            }
        return ind;
    }
}