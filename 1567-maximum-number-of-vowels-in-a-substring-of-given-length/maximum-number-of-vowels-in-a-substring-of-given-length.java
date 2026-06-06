class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> hm= new HashSet<>();
        int n=s.length(),count=0;
        hm.add('a');hm.add('e');hm.add('i');hm.add('o');hm.add('u');

        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(hm.contains(ch)){
                count++;
            }
        }
        int ans=count;
        for(int i=k;i<n;i++){
             char ch=s.charAt(i-k);
            if(hm.contains(ch)){
                count--;
            }
            ch=s.charAt(i);
            if(hm.contains(ch)){
                count++;
            }
            
        ans=Math.max(ans,count);
        }
        return ans;
    }
}