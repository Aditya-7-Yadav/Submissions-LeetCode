class Solution {
    public boolean canReach(String s, int minj, int maxj){
        int n=s.length();
        if(s.charAt(n-1)=='1')return false;
        boolean[] dp=new boolean[n];
        dp[n-1]=true;
        for(int i=n-2;i>-1;i--){
            if(s.charAt(i)=='0')
            {for(int j=i+minj;j<Math.min(i+maxj+1,n);j++){
                if(dp[j]){
                    dp[i]=true;
                    break;
                }
            }
            }
        }
        return dp[0];
    }
}