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
    public TreeNode createBinaryTree(int[][] des) {
        Map<Integer, TreeNode> hm= new HashMap<>();
        Set<Integer> hs= new HashSet<>();
        TreeNode head= null;
        for(int i=0;i<des.length;i++){
            int par=des[i][0],chi=des[i][1];
            TreeNode per=null;
            if(!hm.containsKey(par)){
                per= new TreeNode(par);
                hm.put(par,per);
            }
                per= hm.get(par);
                TreeNode chil=null;
                if(hm.containsKey(chi)){
                     chil= hm.get(chi);
                }
                else{
                    chil= new TreeNode(chi);
                    hm.put(chi,chil);
                }
                if(des[i][2]==0)per.right=chil;
                else per.left=chil;
                hs.add(chi);
            }
            for(int val:hm.keySet())if(!hs.contains(val))return hm.get(val);
            return null;
        }
    }
