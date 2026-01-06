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
    public int maxLevelSum(TreeNode root) {
        int ans=1,i=1,minn=Integer.MIN_VALUE;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int sum=0;
            int n=q.size();
            while(n>0 && !q.isEmpty()){
                TreeNode t= q.poll();
                sum+=t.val;
                if(t.left!=null)q.add(t.left);
                if(t.right!=null)q.add(t.right);
                n--;
            }
            
            if(minn<sum){
                ans=i;
                minn=sum;
            }
            i++;
        }
        return ans;
    }
}