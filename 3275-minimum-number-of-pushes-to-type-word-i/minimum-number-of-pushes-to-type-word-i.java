class Solution {
    public int minimumPushes(String w) {
        int n=w.length();
        int[] f= new int[26];
        for(int i=0;i<n;i++) f[w.charAt(i)-'a']++;
        int ans=0;
        Arrays.sort(f);
        int i=25;
        while(f[i]>0 && i>17){
            ans+= f[i];
            i--;
        }
        while(f[i]>0 && i>9){
            ans+=(f[i]*2);
            i--;
        }
        while(f[i]>0 && i>1){
            ans+=(3*f[i]);
            i--;
        }
        while(i>-1 && f[i]>0 ){
            ans+= 4 * f[i];
            i--;
        }
        return ans;
    }
}