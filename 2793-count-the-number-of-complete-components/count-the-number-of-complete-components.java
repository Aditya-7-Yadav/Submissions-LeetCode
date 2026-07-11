class Solution {
    public int countCompleteComponents(int n, int[][] ed) {
        ArrayList<ArrayList<Integer>> al= new ArrayList<>();
        for(int i=0;i<n;i++)al.add(new ArrayList<>());
        for(int i=0;i<ed.length;i++){
            al.get(ed[i][0]).add(ed[i][1]);
            al.get(ed[i][1]).add(ed[i][0]);
        }
        int ans=0;
        boolean[] vis= new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                int[] temp=new int[2];
                trav(vis,al,i,temp);
                if(temp[0]*(temp[0]-1) == temp[1])ans++;
            }
        }
        return ans;
    }
    public void trav(boolean[] vis,ArrayList<ArrayList<Integer>> al,int i,int[] temp){
        if(vis[i]){
            return ;
        }
        temp[0]++;
        vis[i]=true;
        for(int j=0;j<al.get(i).size();j++){
            trav(vis,al,al.get(i).get(j),temp);
            temp[1]++;
        }
    }
}