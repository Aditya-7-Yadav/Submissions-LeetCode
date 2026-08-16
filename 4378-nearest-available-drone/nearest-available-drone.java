class Solution {
    public int nearestDrone(int[][] dr, int[] tar) {
        int ans=99999,ind=-1;
        for(int i=0;i<dr.length;i++){
            int dis=Math.abs(dr[i][0]-tar[0])+Math.abs(dr[i][1]-tar[1]);
            if(dis<=dr[i][2]){
                if(dis<ans){
                    ans=dis;
                    ind=i;
                }
            }
        }
        return ind;
    }
}