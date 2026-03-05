class Solution {
    public int removeAlmostEqualCharacters(String wd) {
        int ans=0;
        for(int i=1;i<wd.length();i++){
            if(Math.abs(wd.charAt(i)-wd.charAt(i-1))<=1){
                ans++;
                i++;
            }
        }
        return ans;
    }
}