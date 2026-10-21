class Solution {
    public boolean isFascinating(int n) {
        int[] f= new int[10];
        String s=n+"";
        for(int i=0;i<3;i++){
            int num=s.charAt(i)-'0';
            if(num==0 || f[num]>0)return false;
            f[num]++;
        }
        s= s+ n*2 +"";
        for(int i=3;i<6;i++){
            int num=s.charAt(i)-'0';
            if(num==0 || f[num]>0)return false;
            f[num]++;
        }
        s= s+ n*3 +"";
        for(int i=6;i<9;i++){
            int num=s.charAt(i)-'0';
            if(num==0 || f[num]>0)return false;
            f[num]++;
        }
        return true;
    }
}