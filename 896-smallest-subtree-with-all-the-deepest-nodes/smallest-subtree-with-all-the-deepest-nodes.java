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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        int left=find(root.left);
        int right=find(root.right);
        if(left<right)return subtreeWithAllDeepest(root.right);
        else if (left>right)return subtreeWithAllDeepest(root.left);
        return root;
    }
    public int find(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(find(root.left),find(root.right));
    }
}