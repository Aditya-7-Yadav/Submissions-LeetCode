class Solution {
    public int countHomogenous(String s) {
        int mx=0,n=s.length();
        int mod=1000000007;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int j=i;
            while(j<n-1){
                if(ch==s.charAt(j+1))j++;
                else break;
            }
            long len=j-i+1;
            long add=len*(len+1)/2;
            mx=(int)((mx+add)%mod);
            i=j;
        }
        return mx;
    }
}