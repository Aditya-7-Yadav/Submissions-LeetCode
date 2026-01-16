class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length(),m=str2.length();
        int [][] dp= new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1))dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        StringBuilder sb=new StringBuilder();
        int i=n,j=m;
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                sb.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i][j-1]>dp[i-1][j])j--;
            else i--;
        }
        String s=sb.reverse().toString();
        char[] ch= new char[n+m-s.length()];
        i=0;j=0;
        int k=0,pp=0;
        while(k<s.length()){
            while(i<str1.length()&& str1.charAt(i)!=s.charAt(k)){
                ch[pp]=str1.charAt(i);
                i++;
                pp++;
            }

            while(j<str2.length() && str2.charAt(j)!=s.charAt(k)){
                ch[pp]=str2.charAt(j);
                j++;
                pp++;
            }
            ch[pp]=s.charAt(k);
            i++;
            j++;
            k++;
            pp++;
        }
        while(i<str1.length()){
                ch[pp]=str1.charAt(i);
                i++;
                pp++;
            }
             while(j<str2.length() ){
                ch[pp]=str2.charAt(j);
                j++;
                pp++;
            }
        return new String(ch);
    }
}