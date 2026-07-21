class Solution {
    public int maxPower(String s) {
        int mx=0,n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int j=i;
            while(j<n-1){
                if(ch==s.charAt(j+1))j++;
                else break;
            }
            mx=Math.max(mx,j-i+1);
            i=j;
        }
        return mx;
    }
}