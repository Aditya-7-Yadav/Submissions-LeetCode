class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        trav(0,0,n,ans,sb);
        return ans;
    }

    public void trav(int open,int close,int n,ArrayList<String> ans,StringBuilder sb){
        if(sb.length()==2*n){
            ans.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append('(');
            trav(open+1,close,n,ans,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            trav(open,close+1,n,ans,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
