class Solution {
    public double angleClock(int hr, int min) {
        double ans=0,hra=0,mina=0;
        if(hr==12)hr=0;
        mina=(min/5.0)*30;
        hra=(hr)*30;
        hra+=(mina/360)*30;
        ans=Math.abs(hra-mina);
        return Math.min(360-ans,ans);
    }
}