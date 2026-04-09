class Solution {
    int count=0;
    
    public boolean isCompleteTree(TreeNode root) {
        count = countNodes(root);
        return dfs(root,1);
    }
    
    public int countNodes(TreeNode root){
        if(root==null)return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    
    public boolean dfs(TreeNode root,int idx){
        if(root==null)return true;
        if(idx>count)return false;
        return dfs(root.left,2*idx) && dfs(root.right,2*idx+1);
    }
}