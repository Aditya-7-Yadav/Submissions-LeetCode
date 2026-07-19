class Solution {
    public String smallestSubsequence(String s) {
       char[] ch= s.toCharArray();
        StringBuilder sb= new StringBuilder("");
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<ch.length;i++){
            hm.put(ch[i],i);
        }
        Stack<Character> st= new Stack<>();
        Set<Character> vis = new HashSet<>();
        int i=0;
        while(i<ch.length){
            if(vis.contains(ch[i])){
                i++;
                continue;
            }
            while(!st.isEmpty() && st.peek()>ch[i] && hm.get(st.peek())>i){
                vis.remove(st.pop());
            }
            st.push(ch[i]);
            vis.add(ch[i]);
            i++;
        }
        return st.toString().replaceAll("[\\[\\], ]", "");
    }
}