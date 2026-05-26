class Solution {
    public String capitalizeTitle(String tit) {
        String[] s=tit.split(" ");
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<s.length;i++){
           
            if(s[i].length()<=2){
                String ss=s[i].toLowerCase();
                if(i!=0)ans.append(" "+ss);
                else ans.append(ss);
            }
            else{
                 String ss=s[i].substring(1).toLowerCase();
                if(i!=0)ans.append(" "+ Character.toUpperCase(s[i].charAt(0)) + ss);
                else ans.append(Character.toUpperCase(s[i].charAt(0)) + ss);
            }
        }
        return ans.toString();
    }
}