class Solution {
    public int countDaysTogether(String aa, String la, String ab, String lb) {
        int ans=0;
        int[] mn= new int[13];
        mn[2]=31;
        mn[3]=59;
        for(int i=4;i<=12;i++){
            mn[i]=mn[i-1]+30;
            if(i<7)if(i%2==0)mn[i]++;
            if(i==8)mn[i]++;
            else if(i>7 && i%2==1)mn[i]++;
        }
        int sta= mn[Integer.parseInt(aa.substring(0,2))] + Integer.parseInt(aa.substring(3,5)), stb=mn[Integer.parseInt(ab.substring(0,2))] + Integer.parseInt(ab.substring(3,5));
        int ea=mn[Integer.parseInt(la.substring(0,2))] + Integer.parseInt(la.substring(3,5)), eb=mn[Integer.parseInt(lb.substring(0,2))] + Integer.parseInt(lb.substring(3,5));
        int on=0;
        for(int i=1;i<=365;i++){
            if(sta==i )on++;
            if( stb==i)on++;
            if(on==2)ans++;
            if(ea==i){
                on--;
                break;
            }
            if(eb==i){
                on--;
                break;
            }

        }
        return ans;
    }
}