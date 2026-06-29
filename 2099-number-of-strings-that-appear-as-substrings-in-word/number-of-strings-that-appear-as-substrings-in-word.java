class Solution {
    public int numOfStrings(String[] pat, String word) {
        int ans=0;
        for(int i=0;i<pat.length;i++)if(word.contains(pat[i]))ans++;
        return ans;
    }
}