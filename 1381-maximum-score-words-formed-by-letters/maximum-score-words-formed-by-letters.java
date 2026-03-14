class Solution {
    int ans=0;
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        ans=0;
        int[] ovr= new int[26];
        for(int i=0;i<letters.length;i++)ovr[letters[i]-'a']++;
        trav(0,0,words,letters,ovr,score);
    return ans;
}
    void trav(int i,int curr,String[] words, char[] letters,int[] ovr, int[] score){
        if(i==words.length){
            ans=Math.max(ans,curr);
            return;
        }
        int[] b=Arrays.copyOf(ovr,ovr.length);
        int temp=0;
        for(int j=0;j<words[i].length();j++){
            b[words[i].charAt(j)-'a']--;
            if(b[words[i].charAt(j)-'a']<0){
                temp=0;
                break;
            }
            else temp+=score[words[i].charAt(j)-'a'];
        }
        if(temp>0)trav(i+1,curr+temp,words,letters,b,score);
        trav(i+1,curr,words,letters,ovr,score);
    }
}
