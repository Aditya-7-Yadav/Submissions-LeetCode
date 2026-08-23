class Solution {
    public boolean sumGame(String s) {
        int s1=0,s2=0,q1=0,q2=0,n=s.length();

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='?'){
                if(i<n/2)q1++;
                else q2++;
            }
            else{
                if(i<n/2)s1+=s.charAt(i)-'0';
                else s2+=s.charAt(i)-'0';
            }
        }

        int diff=s1-s2;
        int qdiff=q2-q1;

        if(qdiff%2!=0)return true;

        return 2*diff!=9*qdiff;
    }
}