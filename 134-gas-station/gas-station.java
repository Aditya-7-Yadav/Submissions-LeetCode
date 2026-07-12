class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int maxx=0;
        for(int i=0;i<gas.length;i++)maxx+=gas[i]-cost[i];
        if(maxx<0)return -1;
        int minn=0,temp=0,ans=-1;
        for(int i=0;i<gas.length;i++){
            temp+=gas[i];
            temp-=cost[i];
           if(temp<minn){
            minn=temp;
            ans=i;
           }
        }

        return (ans+1)%gas.length;
    }
}