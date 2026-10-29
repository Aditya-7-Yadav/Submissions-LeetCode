class Solution {
    public int numJewelsInStones(String jew, String st) {
        Set<Character> hs= new HashSet<>();
        int ans=0;
        for(int i=0;i<jew.length();i++)hs.add(jew.charAt(i));
        for(int i=0;i<st.length();i++)if(hs.contains(st.charAt(i)))ans++;
        return ans;
    }
}