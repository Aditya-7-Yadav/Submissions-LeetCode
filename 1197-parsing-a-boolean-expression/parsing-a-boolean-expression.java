class Solution {
    public boolean parseBoolExpr(String exp) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch= exp.charAt(i);
            if(ch==',' || ch=='(')continue;
            if(ch!=')')st.push(ch);
            else{
                boolean ff=false,tt=false;
                while(st.peek()!='!' && st.peek()!='&' && st.peek()!='|'){
                    char ch2=st.pop();
                    ff=(ff || (ch2=='f'));
                    tt= (tt || (ch2=='t'));
                }
                char op=st.pop();
                if(op=='&'){
                    if(ff)st.push('f');
                    else st.push('t');
                }
                else if(op=='|'){
                    if(tt)st.push('t');
                    else st.push('f');
                }
                else {
                    if(ff)st.push('t');
                    else st.push('f');
                }
            }
        }
        
        return st.peek()=='t';
    }
}