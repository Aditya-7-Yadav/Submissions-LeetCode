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
    long total=0,anss=0;
    public int maxProduct(TreeNode root) {
        long ans=0;
        total=0;
        trav(root);
        ans =trav2(root);
        anss=anss%1000000007;
        return (int)anss;
    }
    public void trav(TreeNode root){
        if(root==null)return;
        total+=root.val;
        trav(root.left);
        trav(root.right);

    }
    public int trav2(TreeNode root){
        if(root==null)return 0;
        int left=trav2(root.left);
        int right=trav2(root.right);
        int n=root.val+left+right;
        anss=Math.max(anss,(total-n)*n);
        return root.val+left+right;
    }
}