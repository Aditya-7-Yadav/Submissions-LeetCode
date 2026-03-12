class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        int ans=0;
        boolean odd=false;
        for(int v:hm.values()){
            if(v%2==0)ans+=v;
            else{
                ans+=v-1;
                odd=true;
            }
        }
        if(odd)ans++;
        return ans;
    }
}