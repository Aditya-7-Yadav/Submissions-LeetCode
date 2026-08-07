class Solution {
    public int snakesAndLadders(int[][] board) {
        int n=board.length;
        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[n*n+1];
        q.offer(1);
        vis[1]=true;
        int ans=0;

        while(!q.isEmpty()){
            int s=q.size();
            while(s-->0){
                int cur=q.poll();
                if(cur==n*n)return ans;

                for(int i=1;i<=6&&cur+i<=n*n;i++){
                    int next=cur+i;
                    int[] p=find(next,n);
                    if(board[p[0]][p[1]]!=-1)next=board[p[0]][p[1]];
                    if(!vis[next]){
                        vis[next]=true;
                        q.offer(next);
                    }
                }
            }
            ans++;
        }
        return -1;
    }

    int[] find(int x,int n){
        int r=(x-1)/n;
        int c=(x-1)%n;
        if(r%2==1)c=n-1-c;
        return new int[]{n-1-r,c};
    }
}