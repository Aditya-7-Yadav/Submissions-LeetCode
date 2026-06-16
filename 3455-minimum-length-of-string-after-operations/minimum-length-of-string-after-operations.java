class Solution {
    public int minimumLength(String s) {
        Map<Character,Integer> hm= new HashMap<>();
        int n=s.length(),ans=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char ch:hm.keySet()){
            int num=hm.get(ch);
            if(num>=3 && num%2==1)ans+=num-1;
            else if(num>=3 && num%2==0)ans+=num-2;
        }
        return n-ans;
    }
}