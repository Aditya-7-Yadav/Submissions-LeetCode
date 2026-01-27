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
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> al= new ArrayList<>();
        trav(root,al);
        for(int i=0;i<al.size()-1;i++){
            al.get(i).left=null;
            al.get(i).right=al.get(i+1);
        }
        
    }
    public void trav(TreeNode root,ArrayList<TreeNode> al){
        if(root==null)return;
        al.add(root);
        trav(root.left,al);
        trav(root.right,al);
    }
}