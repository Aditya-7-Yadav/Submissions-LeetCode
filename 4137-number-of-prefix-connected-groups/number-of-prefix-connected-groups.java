class Solution {
    public int prefixConnected(String[] words, int k) {
        Map<String,Integer> hm = new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(words[i].length()<k)continue;
            String s= words[i].substring(0,k);
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        int ans=0;
for(int v:hm.values()){
    if(v>1)ans++;
}
        return ans;
    }
}