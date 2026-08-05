class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] inv) {
        List<Integer> ans= new ArrayList<>();
        List<List<Integer>> adj= new ArrayList<>();
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
        for(int i=0;i<inv.length;i++){
            int u=inv[i][0];
            int v=inv[i][1];
            adj.get(u).add(v);
        }
        trav(k,hs,adj);
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(hs.contains(i))continue;
            for(int j=0;j<adj.get(i).size();j++){
                if(hs.contains(adj.get(i).get(j))){
                    flag=true;
                    break;
                }
            }
            if(flag)break;
        }
        for(int i=0;i<n;i++){
            if(hs.contains(i)){
                if(flag)ans.add(i);
            }
            else ans.add(i);
        }
        return ans;
    }
    public void trav(int k, HashSet<Integer> hs, List<List<Integer>> adj){
        if(hs.contains(k))return;
        hs.add(k);
        for(int i=0;i<adj.get(k).size();i++){
            
            trav(adj.get(k).get(i),hs,adj);
            
        }
    }
}