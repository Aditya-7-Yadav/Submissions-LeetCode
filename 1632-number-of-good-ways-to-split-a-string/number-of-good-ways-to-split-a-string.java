class Solution {
    public int numSplits(String s) {
        int n=s.length();
        int[] lu= new int[n];
        int[] ru= new int[n];
        HashSet<Character> hs1= new HashSet<>();
        HashSet<Character> hs2= new HashSet<>();
        
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i),ch2=s.charAt(n-i-1);
            hs1.add(ch1);
            ru[n-1-i]=hs2.size();
            hs2.add(ch2);
            lu[i]=hs1.size();
            
        }
        int ans=0;
        for(int i=0;i<n;i++)if(lu[i]==ru[i])ans++;
        return ans;
    }
}