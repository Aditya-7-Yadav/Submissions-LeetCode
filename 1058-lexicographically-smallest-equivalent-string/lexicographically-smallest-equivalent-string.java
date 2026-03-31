class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        char[] ch= new char[26];
        for(int i=0;i<26;i++)ch[i]=(char)(i+'a');
        for(int i=0;i<s1.length();i++){
            char ch1=(char)ch[s1.charAt(i)-'a'],ch2=ch[s2.charAt(i)-'a'];
            char ch3=(char)Math.min(ch1,ch2);
            for(int ii=0;ii<26;ii++)if(ch[ii]==ch1 || ch[ii]==ch2 || ii==ch2-'a' || ii==ch1-'a')ch[ii]=(char)Math.min(ch[ii],ch3);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<baseStr.length();i++){
            sb.append(ch[baseStr.charAt(i)-'a']);
        }
        return sb.toString();
    }
}