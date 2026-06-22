class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] f = new int[5];
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch=='b')f[0]++;
            else if(ch=='a')f[1]++;
            else if(ch=='l')f[2]++;
            else if(ch=='o')f[3]++;
            else if(ch=='n')f[4]++;
            
        }
        f[2]/=2;
        f[3]/=2;
        int ans=99999;
        for(int i=0;i<5;i++)ans=Math.min(ans,f[i]);
        return ans;
    }
}