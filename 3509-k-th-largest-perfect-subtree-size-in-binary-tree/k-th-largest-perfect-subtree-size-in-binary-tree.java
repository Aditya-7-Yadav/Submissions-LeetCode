class Solution {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

    public int kthLargestPerfectSubtree(TreeNode root,int k){
        pq.clear();
        trav(root);
        if(pq.size()<k)return -1;
        for(int i=1;i<k;i++)pq.poll();
        return pq.peek();
    }

    int trav(TreeNode root){
        if(root==null)return 0;

        int left=trav(root.left);
        int right=trav(root.right);

        if(left==-1||right==-1||left!=right)return -1;

        int h=left+1;
        int size=1;
        for(int i=0;i<h;i++)size=size*2;
        size=size-1;

        pq.add(size);
        return h;
    }
}
