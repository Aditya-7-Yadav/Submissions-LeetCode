/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q1= new LinkedList<>();
        q1.offer(root);
        int lev=0;
        while(!q1.isEmpty()){
            if(lev%2==0 && q1.peek().left!=null){
            List<Integer> q2= new ArrayList<>();
            int n=2*(lev+1);
            for(int i=0;i<(int)Math.pow(2,lev);i++){
                q2.add(q1.peek().left.val);
                q2.add(q1.peek().right.val);
                q1.offer(q1.poll());
            }
            Collections.reverse(q2);
            for(int i=0;i<2*(int)Math.pow(2,lev);i+=2){
                q1.peek().left.val=q2.get(i);
                q1.peek().right.val=q2.get(i+1);
                q1.offer(q1.poll());
            }
            }
            for(int i=0;i<(int)Math.pow(2,lev);i++){
                TreeNode tn= q1.poll();
                if(tn.left!=null)
                    q1.offer(tn.left);
                if(tn.right!=null)q1.offer(tn.right);
                
            }
            lev++;
        }
        return root;
    }
}