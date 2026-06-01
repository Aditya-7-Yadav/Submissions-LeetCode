class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        if(cost.length==1)return cost[0];
        else if(cost.length==2)return cost[0]+cost[1];
         int ans=0,i=cost.length-1;
        while(i>1){
            ans+=cost[i];
            ans+=cost[i-1];
            i-=3;
        }
        if(i==1)ans+=cost[0]+cost[1];
        else if(i==0) ans+=cost[0];
        return ans;
    }
}