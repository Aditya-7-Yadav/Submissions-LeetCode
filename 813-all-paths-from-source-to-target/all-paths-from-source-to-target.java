class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ArrayList<List<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<Integer>();
        temp.add(0);
        trav(0,ans,temp,graph);
        return ans;
    }
    void trav(int i,ArrayList<List<Integer>> ans,ArrayList<Integer> temp,int[][] graph){
        if(i==graph.length-1){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int j=0;j<graph[i].length;j++){
            temp.add(graph[i][j]);
            trav(graph[i][j],ans,temp,graph);
            temp.remove(temp.size()-1);
        }
    }
}