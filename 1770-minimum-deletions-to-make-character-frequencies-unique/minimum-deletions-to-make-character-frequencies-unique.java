class Solution {
    public int minDeletions(String s) {
        int[] f=new int[26];
        for(char c:s.toCharArray()) f[c-'a']++;

        Set<Integer> set=new HashSet<>();
        int ans=0;

        for(int x:f){
            while(x>0 && set.contains(x)){
                x--;
                ans++;
            }
            if(x>0) set.add(x);
        }

        return ans;
    }
}