class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans= new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            int left=0,right=0;
            boolean flag=true;
            for(int j=0;j<queries[i].length();j++){
                if(left>=pattern.length()){
                    if(Character.isUpperCase(queries[i].charAt(j))){
                    flag=false;
                    break;
                }
                else continue;
                }
                char ch1=queries[i].charAt(j),ch2=pattern.charAt(left);
                if(Character.isUpperCase(ch1)){
                    if(ch2!=ch1){
                        flag=false;
                        break;
                    }
                    else left++;
                }
                else if(ch2==ch1)left++;
            }
            ans.add(flag && left==pattern.length());
        }
        return ans;
    }
}