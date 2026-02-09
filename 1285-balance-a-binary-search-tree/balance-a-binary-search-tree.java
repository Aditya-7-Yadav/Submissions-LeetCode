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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        trav(root,arr);
        return build(0,arr.size()-1,arr);
    }
    void trav(TreeNode root,ArrayList<Integer> arr){
        if(root==null)return;
        trav(root.left,arr);
        arr.add(root.val);
        trav(root.right,arr);
    }
    TreeNode build(int l,int r,ArrayList<Integer> arr){
        if(l>r)return null;
        int m=(l+r)/2;
        TreeNode node=new TreeNode(arr.get(m));
        node.left=build(l,m-1,arr);
        node.right=build(m+1,r,arr);
        return node;
    }
}
