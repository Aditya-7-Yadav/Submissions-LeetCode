class Solution {
    public int closestTarget(String[] words, String target, int st) {
        int ind=0,ans=Integer.MAX_VALUE,n=words.length;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int fr=0;
                if(st<=i){
                    fr=i-st;
                }
                else fr=(n-st+i)%n;
                int bc=0;
                if(st>=i)bc=st-i;
                else bc=(n-i+st)%n;
                ans=Math.min(ans,Math.min(fr,bc));
            }
        }
        if(ans==Integer.MAX_VALUE)return -1;
        return ans;
    }
}