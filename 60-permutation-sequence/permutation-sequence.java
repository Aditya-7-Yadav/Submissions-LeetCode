class Solution {
    int num=0;
    public String getPermutation(int n, int k) {
        num=k-1;
        String[] ans= new String[n];
        String[] anss=new String[1];
        for(int i=0;i<n;i++)ans[i]=(i+1)+"";
        boolean[] vis=new boolean[n];
        StringBuilder sb= new StringBuilder();
        trav(0,k,n,ans,anss,vis,sb);
        return anss[0];
    }
    void trav(int i,int k,int n,String[] ans,String[] anss,boolean[] vis,StringBuilder sb){
         if(num<-1)return;
        if(i==n){
            num--;
            if(num==-1)anss[0]=sb.toString();
            return;
        }
        for(int ii=0;ii<n;ii++){
            if(!vis[ii]){
                vis[ii]=true;
                sb.append(ans[ii]);
                trav(i+1,k,n,ans,anss,vis,sb);
                vis[ii]=false;
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}