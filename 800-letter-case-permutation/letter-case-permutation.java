class Solution {
    public List<String> letterCasePermutation(String s) {
        ArrayList<String> ans= new ArrayList<>();
        StringBuilder sb= new StringBuilder(s);
        trav(0,s,ans,sb);
        return ans;
    }
    public void trav(int i,String s,ArrayList<String> ans,StringBuilder sb ){
        if(i==s.length()){
            ans.add(sb.toString());
            return;
        }
        char c=sb.charAt(i);
        trav(i+1,s,ans,sb);
        if(Character.isLetter(c)){
            if(Character.isUpperCase(c))sb.setCharAt(i,Character.toLowerCase(c));
            else sb.setCharAt(i,Character.toUpperCase(c));
            trav(i+1,s,ans,sb);
        }
    }
}