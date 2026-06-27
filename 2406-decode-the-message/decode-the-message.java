class Solution {
    public String decodeMessage(String key, String mes) {
        int[] freq= new int[26];
        int temp=0;
        Set<Character> hs= new HashSet<>();
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            if(ch!=' ' && temp<26 && !hs.contains(ch)){
                freq[ch-'a']=temp++;
                hs.add(ch);
            }
        }

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<mes.length();i++){
            char ch=mes.charAt(i);
            if(ch==' '){
                sb.append(' ');
                continue;
            }
            sb.append((char)(freq[ch-'a']+'a'));
        }
        return sb.toString();
    }
}