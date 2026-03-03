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
            int s=q.size();
            List<Node> al= new ArrayList<>();
            while(s>0){
                al.add(q.poll());
                s--;
            }
            int i=0;
            while(i<al.size()-1){
                al.get(i).next=al.get(i+1);
                
                if(al.get(i).left!=null)q.offer(al.get(i).left);
                if(al.get(i).right!=null)q.offer(al.get(i).right);
                i++;
            }
           if(al.get(al.size()-1).left!=null) q.offer(al.get(al.size()-1).left);
           if(al.get(al.size()-1).right!=null) q.offer(al.get(al.size()-1).right);
        }
        return root;
    }
}