class Solution {
    public int longestStrChain(String[] w) {
        Arrays.sort(w,(a,b)->a.length()-b.length());
        int ans=0,m=w.length;
        int[] dp = new int[m];
        for(int i=m-1;i>-1;i--){
            int curr=0;
            dp[i]=1;
            for(int j=i+1;j<m;j++){
                if(dp[j]>curr && w[i].length() +1 == w[j].length()){
                    int mx=0;
                    boolean fnd=false;
                    for(int k=0;k<(mx==0?w[i].length() :w[j].length());k++){
                        char ch1,ch2=w[j].charAt(k);
                        if(mx==1)ch1=w[i].charAt(k-1);
                        else ch1=w[i].charAt(k);
                        if(ch1!=ch2){
                            if(mx==1){
                                fnd=true;
                                break;
                            }
                            else mx++;
                        }
                    }
                    if(!fnd)dp[i]=Math.max(1+dp[j],dp[i]);
                }
            }
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}