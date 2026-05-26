class Solution {
    public int numberOfSpecialChars(String w) {
        Set<Character> hs= new HashSet<>();
        int ans=0;
        for(int i=0;i<w.length();i++)hs.add(w.charAt(i));
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            int cnt=0;
            if(hs.contains(ch))cnt++;
            if(hs.contains((char)(ch-32)))cnt++;
            if(cnt==2)ans++;
        }
        return ans;
    }
}