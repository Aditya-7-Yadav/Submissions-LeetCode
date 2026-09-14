class Solution {
    public int numberOfPairs(int[][] points) {
        int n=points.length;
        Arrays.sort(points,(a,b)->a[0]!=b[0]?a[0]-b[0]:b[1]-a[1]);
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(points[i][1]<points[j][1])continue;
                boolean val=true;
                for(int k=i+1;k<j;k++){
                    if(points[k][0]>=points[i][0] &&
                       points[k][0]<=points[j][0] &&
                       points[k][1]<=points[i][1] &&
                       points[k][1]>=points[j][1]){
                        val=false;
                        break;
                    }
                }
                if(val)ans++;
            }
        }
        return ans;
    }
}