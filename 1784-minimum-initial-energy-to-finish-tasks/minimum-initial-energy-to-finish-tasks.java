class Solution {
    public int minimumEffort(int[][] tasks) {
        int ans=0,curr=0;
        for(int i=0;i<tasks.length;i++){
            tasks[i][0]=tasks[i][1]-tasks[i][0];
        }
        Arrays.sort(tasks,(a,b)->b[0]-a[0]);
        for(int i=0;i<tasks.length;i++){
            if(tasks[i][1]-curr>=0){
                ans+=tasks[i][1]-curr;
                curr=tasks[i][1];
            }
            curr=curr+(tasks[i][0]-tasks[i][1]);
        }
        return ans;
    }
}