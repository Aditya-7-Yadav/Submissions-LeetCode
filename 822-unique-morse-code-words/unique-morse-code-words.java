class Solution {
    public int uniqueMorseRepresentations(String[] w) {
        String[] freq= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> hs= new HashSet<>();
        for(int i=0;i<w.length;i++){
            StringBuilder sb= new StringBuilder();
            for(int j=0;j<w[i].length();j++)sb.append(freq[w[i].charAt(j)-'a']);
            hs.add(sb.toString());
        }
        return hs.size();
    }
}