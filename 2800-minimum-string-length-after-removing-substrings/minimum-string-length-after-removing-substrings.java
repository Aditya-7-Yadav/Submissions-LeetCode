class Solution {
    public int minLength(String s) {
        Stack<Character> st= new Stack<>();
        int i=0;

        while(i<s.length()){
            char c=s.charAt(i);
            i++;
            if(c=='B'&& !st.isEmpty() && st.peek()=='A'){
                st.pop();
                continue;
            }
            else if(c=='D'&& !st.isEmpty() && st.peek()=='C'){
                st.pop();
                continue;
            }
            st.push(c);
        }
        return st.size();
    }
}