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
    public int goodNodes(TreeNode root) {
        return trav(root,-1000000);
    }
    public int trav(TreeNode root,int maxx){
        if(root==null)return 0;
        int curr=0;
        if(maxx<=root.val){
            curr++;
         maxx=root.val;
        }
        return curr+ trav(root.right,maxx) +trav(root.left,maxx);
    }
}