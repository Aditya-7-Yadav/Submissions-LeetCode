class Solution {
    public String countAndSay(int n) {
        
        StringBuilder prev= new StringBuilder("1");
        while(n>1){
            StringBuilder sb= new StringBuilder();
            for(int i=0;i<prev.length();i++){
                int temp=1;
                while(i<prev.length()-1 && prev.charAt(i)==prev.charAt(i+1)){
                    i++;
                    temp++;
                }
                sb.append(temp+""+prev.charAt(i));
            }
            prev=sb;
            n--;
        }
        return prev.toString();
    }
}