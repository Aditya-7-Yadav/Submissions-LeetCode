class Solution {
    public int findLongestChain(int[][] pairs) {
        int n=pairs.length,ans=0,end=-1000000;
        Arrays.sort(pairs, (a,b) -> Integer.compare(a[1], b[1]));
        
        for(int i=0;i<n;i++){
            if(pairs[i][0]>end){
                ans++;
                end=pairs[i][1];
            }
        }
        return ans;
    }
}