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
    public int maxAncestorDiff(TreeNode root) {
        int[]ans= new int[1];
        ans[0]=0;
        int min=root.val, max=root.val;
        trav(root.left,min,max,ans);
        trav(root.right,min,max,ans);
        return ans[0];
    }
    public void trav(TreeNode root,int min, int max,int[] ans){
        if(root==null)return;
        ans[0]=Math.max(Math.abs(min-root.val),ans[0]);
        ans[0]=Math.max(Math.abs(max-root.val),ans[0]);
        min=Math.min(root.val,min);
        max=Math.max(root.val,max);
        trav(root.left,min,max,ans);
        trav(root.right,min,max,ans);
    }
}