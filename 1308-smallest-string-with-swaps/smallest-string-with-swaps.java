class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> p) {
        int n=s.length();
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(List<Integer> pair:p){
            int a=pair.get(0);
            int b=pair.get(1);
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        boolean[] vis=new boolean[n];
        char[] ans=s.toCharArray();

        for(int i=0;i<n;i++){
            if(vis[i]) continue;

            List<Integer> indices=new ArrayList<>();
            List<Character> chars=new ArrayList<>();

            dfs(i,adj,vis,indices,chars,s);

            Collections.sort(indices);
            Collections.sort(chars);

            for(int j=0;j<indices.size();j++){
                ans[indices.get(j)]=chars.get(j);
            }
        }

        return new String(ans);
    }

    public void dfs(int node,List<List<Integer>> adj,boolean[] vis,List<Integer> indices,List<Character> chars,String s){
        vis[node]=true;
        indices.add(node);
        chars.add(s.charAt(node));

        for(int next:adj.get(node)){
            if(!vis[next]){
                dfs(next,adj,vis,indices,chars,s);
            }
        }
    }
}