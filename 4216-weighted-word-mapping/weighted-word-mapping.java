class Solution {
    public String mapWordWeights(String[] words, int[] wei) {
        StringBuilder sb= new StringBuilder();
        for(int j=0;j<words.length;j++){
            String s=words[j];
            int w=0;
            for(int i=0;i<s.length();i++){
                w+=wei[s.charAt(i)-'a'];
            }
            w%=26;
            char ch=(char)('z'-w);
            sb.append(ch);
        }
        return sb.toString();
    }
}