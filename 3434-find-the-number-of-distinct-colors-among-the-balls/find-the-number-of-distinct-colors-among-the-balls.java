class Solution {
    public int[] queryResults(int limit, int[][] q) {
        int n=q.length;
        int[] ans = new int[n];
        Map<Integer,Set<Integer>> hm = new HashMap<>();
        Map<Integer,Integer> mapp= new HashMap<>();
        for(int i=0;i<n;i++){
            
            if(mapp.getOrDefault(q[i][0],-1)!=-1){
                int col=mapp.get(q[i][0]);
                hm.get(col).remove(q[i][0]);
                if(hm.get(col).size()<1)hm.remove(col);
            }
            Set<Integer> f=hm.getOrDefault(q[i][1],null);
            if(f==null){
                hm.put(q[i][1],new HashSet<>());
                
            }
            hm.get(q[i][1]).add(q[i][0]);
            
            mapp.put(q[i][0],q[i][1]);
            ans[i]=hm.size();
        }
        return ans;
    }
}