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
    public int averageOfSubtree(TreeNode root) {
        return trav(root);
    }
    int cnt(TreeNode root){
        if(root==null)return 0;
        return 1+cnt(root.left)+cnt(root.right);
    }
    int sum(TreeNode root){
        if(root==null)return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    int trav(TreeNode root){
        if(root==null)return 0;
        int left=sum(root.left);
        int right=sum(root.right);
        if((root.val+left+right)/(cnt(root.left)+cnt(root.right)+1)==root.val)return 1+trav(root.left)+trav(root.right);
        return trav(root.left)+trav(root.right);

    }
}