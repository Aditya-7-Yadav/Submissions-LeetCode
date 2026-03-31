/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)return root;
        Queue<Node> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Node> al=new ArrayList<>();
            for(int i=0;i<n;i++){
                al.add(q.poll());
            }
            for(int i=0;i<n-1;i++)al.get(i).next=al.get(i+1);
            for(int i=0;i<al.size();i++){
                Node temp=al.get(i);
                if(temp.left!=null)q.offer(temp.left);
                if(temp.right!=null)q.offer(temp.right);
            }
        }
        return root;
    }
}