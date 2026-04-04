class Solution {
    public String decodeCiphertext(String ent, int rows) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ent.length()/rows;i++){
            int j=i,cnt=0;
            while(j<ent.length() && cnt<Math.min(rows,ent.length()-i)){
                sb.append(ent.charAt(j));
                j+=1+(ent.length()/rows);
                cnt++;
            }
        }
        while(sb.length()>0 && sb.charAt(sb.length()-1)==' ')sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}