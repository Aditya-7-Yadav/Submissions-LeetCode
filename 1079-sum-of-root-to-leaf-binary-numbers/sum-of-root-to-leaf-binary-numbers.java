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
    public int sumRootToLeaf(TreeNode root) {
        StringBuilder sb= new StringBuilder();
        int sum=trav(root,sb);
        return sum;
    }
    public int trav(TreeNode root,StringBuilder sb){
        if(root==null)return 0;
        sb.append(Integer.toString(root.val));
        if(root.left==null && root.right==null){
            int n=Integer.parseInt(sb.toString(),2);
            sb.deleteCharAt(sb.length()-1);
            return n;
        }
        
       int sum= trav(root.left,sb)+ trav(root.right,sb);
        sb.deleteCharAt(sb.length()-1);
        return sum;
    }
}