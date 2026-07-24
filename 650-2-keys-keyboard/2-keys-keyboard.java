class Solution {
    public int minSteps(int n) {
        if(n==1)return 0;
        int ans=1,curr=1,cpy=1;
        boolean cp=true;
        return trav(ans,curr,n,cpy,cp);
    }
    public int trav(int ans,int curr,int n,int cpy,boolean ncpy){
        if(curr>n)return 99999;
        if(curr==n)return ans;
        int c1= trav(ans+1,curr+cpy,n,cpy,false);
        int c2=999999;
        //int c3=trav(ans+1,curr)
        if(!ncpy)c2=trav(ans+1,curr,n,curr,true);
        return Math.min(c1,c2);
    }
}