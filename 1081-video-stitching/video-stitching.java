class Solution {
    public int videoStitching(int[][] clips, int time) {
        Arrays.sort(clips,(a,b)->a[0]-b[0]);
        int ans=0, curr=0, far=0, i=0, n=clips.length;
        while(curr<time){
            while(i<n && clips[i][0]<=curr){
                far=Math.max(far,clips[i][1]);
                i++;
            }
            if(far==curr)return -1;
            curr=far;
            ans++;
        }
        return ans;
    }
}