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
     
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        HashMap<Integer, ArrayList<Integer>> hm= new HashMap<>();
        List<List<Integer>> ans= new ArrayList<>();
        hm.put(0,new ArrayList<>());
        hm.get(0).add(root.val);
        root.val=0;
        q.offer(root);
        while(!q.isEmpty()){
            int n= q.size();
            HashMap<Integer,ArrayList<Integer>> hm2= new HashMap<>();
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                int num=temp.val;
                
                if(temp.left!=null){
                    if(!hm.containsKey(num-1))hm.put(num-1,new ArrayList<>());
                    if(!hm2.containsKey(num-1))hm2.put(num-1,new ArrayList<>());
                    hm2.get(num-1).add(temp.left.val);
                    temp.left.val=num-1;
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    if(!hm.containsKey(num+1))hm.put(num+1,new ArrayList<>());
                    if(!hm2.containsKey(num+1))hm2.put(num+1,new ArrayList<>());
                    hm2.get(num+1).add(temp.right.val);
                    temp.right.val=num+1;
                    q.offer(temp.right);
                }}
                for(int j:hm2.keySet()){
                    ArrayList<Integer> al= hm2.get(j);
                    Collections.sort(al);
                    hm.get(j).addAll(al);
                }
            
        }
        for(int i: hm.keySet()){
            hm.get(i).add(i);
            ans.add(hm.get(i));
        }
        ans.sort((a,b)->a.get(a.size()-1)-b.get(b.size()-1));
        for(int i=0;i<ans.size();i++){
            ans.get(i).remove(ans.get(i).size()-1);
            //Collections.sort(ans.get(i));
        }
        return ans;
    }
}