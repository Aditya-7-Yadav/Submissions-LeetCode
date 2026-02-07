class Solution {
    public int minimumDeletions(String s) {
        int a=0,b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')a++;
            else b++;
        }
        if(a*b==0)return 0;

        int prefB=0;
        int suffA=a;
        int ans=s.length();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')suffA--;
            ans=Math.min(ans,prefB+suffA);
            if(s.charAt(i)=='b')prefB++;
        }
        return ans;
    }
}
