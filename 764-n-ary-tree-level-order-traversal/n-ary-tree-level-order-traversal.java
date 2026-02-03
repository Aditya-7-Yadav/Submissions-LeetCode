/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        ArrayList<List<Integer>> ans= new ArrayList<>();
        Queue<Node> q= new LinkedList<>();
        if(root==null)return ans;
        q.offer(root);
         while( q.size()!=0){
            int  n=q.size();
            List<Integer> tempp= new ArrayList<Integer>();
            for(int i=0;i<n;i++){
            Node temp=q.poll();
            int nn=temp.children.size();
            for(int j=0;j<nn;j++){
                q.offer(temp.children.get(j));
            }
            tempp.add(temp.val);
            }
            ans.add(tempp);
        }
        return ans;
    }
}