class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>()); 
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adjList.get(i).add(j);
                }
            }
        }
        int[] vis= new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                ans++;
                dfs(i,adjList,vis);
            }
           
        }
         return ans;
    }
    public void dfs(int i,List<List<Integer>> adjList,int[] vis){
            vis[i]=1;
            for(int j=0;j<adjList.get(i).size();j++){
                if(vis[adjList.get(i).get(j)]==0)dfs(adjList.get(i).get(j),adjList,vis);
            }
        }

            }
  