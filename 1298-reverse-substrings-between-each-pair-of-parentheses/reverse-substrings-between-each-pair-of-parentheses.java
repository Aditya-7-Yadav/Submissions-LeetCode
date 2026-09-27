class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb= new StringBuilder();
        Stack<Character> st= new Stack<>();
        int i=0,n=s.length();
        while(i<n){
            if(s.charAt(i)==')'){
                StringBuilder sb2= new StringBuilder();
                while(!st.isEmpty() && st.peek()!='('){
                    sb2.append(st.pop());
                }
                st.pop();
                String sbb2=sb2.toString();
                for(int j=0;j<sbb2.length();j++){
                    st.push(sbb2.charAt(j));
                }
            }
            else st.push(s.charAt(i));
            i++;
        }
        while(!st.isEmpty()){
            if(st.peek()!='(')sb.append(st.pop());
            else st.pop();
        }
        return sb.reverse().toString();
    }
}