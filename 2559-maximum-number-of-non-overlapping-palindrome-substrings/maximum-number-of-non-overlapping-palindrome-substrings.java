class Solution {
    public int maxPalindromes(String s,int k) {
        int ans=0,n=s.length();
        for(int i=0;i<n;){
            boolean found=false;
            for(int len=k;len<=k+1;len++){
                if(i+len>n)continue;
                int left=i,right=i+len-1;
                boolean pal=true;
                while(left<right){
                    if(s.charAt(left++)!=s.charAt(right--)){
                        pal=false;
                        break;
                    }
                }
                if(pal){
                    ans++;
                    i+=len;
                    found=true;
                    break;
                }
            }
            if(!found)i++;
        }
        return ans;
    }
}