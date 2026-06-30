class Solution {
    public long countVowels(String w) {
        long ans=0,prev=0;
        for(int i=0;i<w.length();i++){
            char ch=w.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                ans+= prev + i+1;
                prev+=i+1;
            }
            else ans+=prev;

        }
        return ans;
    }
}