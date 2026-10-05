class Solution {
    public int scoreOfParentheses(String s) {
        int ans=0,n=s.length();
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(') st.push(0);
            else{
                int x=st.pop();
                int v=Math.max(1,2*x);
                st.push(st.pop()+v);
            }
        }
        return st.pop();
    }
}