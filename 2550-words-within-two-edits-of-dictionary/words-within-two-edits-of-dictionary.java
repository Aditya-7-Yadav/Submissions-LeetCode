class Solution {
    public List<String> twoEditWords(String[] q, String[] d) {
        List<String> ans= new ArrayList<>();
        for(int i=0;i<q.length;i++){
            boolean can=false;
            for(int j=0;j<d.length;j++){
                if(q[i].length()==d[j].length()){
                    int temp=0;
                    for(int k=0;k<q[i].length();k++){
                        if(q[i].charAt(k)!=d[j].charAt(k))temp++;
                        if(temp>2)break;
                    }
                    if(temp<=2){
                        can=true;
                        break;
                    }
                }
            }
                if(can)ans.add(q[i]);
        }
        return ans;
    }
}