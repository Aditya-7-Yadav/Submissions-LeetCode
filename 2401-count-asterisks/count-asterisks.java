class Solution {
    public int countAsterisks(String s) {
        int ans=0;
        boolean inside=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                inside=!inside;
            }else if(s.charAt(i)=='*'&&!inside){
                ans++;
            }
        }
        return ans;
    }
}