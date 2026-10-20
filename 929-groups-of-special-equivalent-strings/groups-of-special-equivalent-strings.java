class Solution {
    public int numSpecialEquivGroups(String[] words) {
        HashSet<String> hs=new HashSet<>();
        for(String s:words){
            char[] even=new char[(s.length()+1)/2];
            char[] odd=new char[s.length()/2];
            for(int i=0;i<s.length();i++){
                if(i%2==0)even[i/2]=s.charAt(i);
                else odd[i/2]=s.charAt(i);
            }
            Arrays.sort(even);
            Arrays.sort(odd);
            hs.add(new String(even)+new String(odd));
        }
        return hs.size();
    }
}