class Solution {
    public int longestBalanced(String s) {
        int ans=0,n=s.length();
        for(int i=0;i<n;i++){
            Map<Character,Integer> hm= new HashMap<>();
            Map<Integer,Integer> hm2= new HashMap<>();
            for(int j=i;j<n;j++){
                char c= s.charAt(j);
                hm.put(c,hm.getOrDefault(c,0)+1);
                hm2.put(hm.get(c),hm2.getOrDefault(hm.get(c),0)+1);
                if(hm2.containsKey(hm.get(c)-1))hm2.put(hm.get(c)-1,hm2.get(hm.get(c)-1)-1);
                if(hm2.containsKey(hm.get(c)-1) && hm2.get(hm.get(c)-1) < 1)hm2.remove(hm.get(c)-1);
                if(hm2.size()==1)ans=Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}