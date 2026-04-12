class Solution {
    public int minTimeToType(String word) {
        int ans=word.length(),curr=0;
        for(int i=0;i<word.length();i++){
            int diff=Math.abs(word.charAt(i)-'a'-curr);
            ans+=Math.min(diff, 26 - diff);
            curr=word.charAt(i)-'a';
        }
        return ans;
    }
}