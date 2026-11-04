class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st= new Stack<>();
        int n=s.length(),j=t.length()-1,hash=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                if(!st.isEmpty())st.pop();
            }
            else st.push(ch);
        }
        while(j>-1){
            char ch=t.charAt(j);
            if(ch=='#'){
                hash++;
            }
            else{
                if(hash>0){
                    hash--;
                }
                else{
                if(st.isEmpty())return false;
                char ch2=st.pop();
                if(ch!=ch2)return false;
            }
            }
            j--;
        }
        return st.isEmpty();
    }
}