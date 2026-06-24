class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp= new int[days.length];
        Arrays.fill(dp,-1);
        return solve(0,days,costs,dp);
    }

    public int solve(int idx,int[] days,int[] costs,int[] dp){
        if(idx>=days.length)return 0;
        if(dp[idx]!=-1)return dp[idx];

        int a=costs[0]+solve(idx+1,days,costs,dp);

        int i=idx;
        while(i<days.length && days[i]<days[idx]+7)i++;
        int b=costs[1]+solve(i,days,costs,dp);

        i=idx;
        while(i<days.length && days[i]<days[idx]+30)i++;
        int c=costs[2]+solve(i,days,costs,dp);

        return dp[idx]=Math.min(a,Math.min(b,c));
    }
}