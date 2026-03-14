class Solution {
    public String getHappyString(int n, int k) {
        ArrayList<String> big=new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        trav(-1,0,big,sb,n);
        if(k>big.size())return "";
        return big.get(k-1);
    }
    public void trav(int k,int i,ArrayList<String> big,StringBuilder sb, int n){
        if(i==n){
            big.add(sb.toString());
            return;
        }
        for(int ii=0;ii<3;ii++){
            if(ii!=k){
            char ch=(char)('a'+ii);
            sb.append(ch+"");
            trav(ii,i+1,big,sb,n);
            sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}