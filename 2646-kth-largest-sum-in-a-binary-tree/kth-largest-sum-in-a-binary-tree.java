/*
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
    public long kthLargestLevelSum(TreeNode root, int k) {
        int ans=0,i=1;
        PriorityQueue<Long> pq=new PriorityQueue<>();
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            long sum=0;
            int n=q.size();
            while(n>0 && !q.isEmpty()){
                TreeNode t= q.poll();
                sum+=t.val;
                if(t.left!=null)q.add(t.left);
                if(t.right!=null)q.add(t.right);
                n--;
            }
            pq.offer(sum);
            if(pq.size()>k)pq.poll();
            i++;
        }
        if(k>i-1)return -1;
    return pq.peek();
    }
}