class Solution {
    public String digitSum(String s, int k) {
        int n=s.length();
        while(k<n){
            StringBuilder ans=new StringBuilder();
            int i=0;
            while(i<n){
                int sum=0;
                for(int j=i;j<Math.min(i+k,n);j++){
                    sum+=s.charAt(j)-'0';
                }
                ans.append(sum);
                i+=k;
            }
            s=ans.toString();
            n=s.length();
        }
        return s;
    }
}