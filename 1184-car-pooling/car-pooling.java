class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] val = new int[1001];
        int n= trips.length;
        for(int i=0;i<n;i++){
            for(int j=trips[i][1];j<trips[i][2];j++){
                val[j]+=trips[i][0];
            }
        }
        for(int i=0;i<1000;i++)if(val[i]>capacity)return false;
        return true;
    }
}