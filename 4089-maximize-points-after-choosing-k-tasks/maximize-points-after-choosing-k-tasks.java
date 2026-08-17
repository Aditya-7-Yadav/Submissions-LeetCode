class Solution {
    public long maxPoints(int[] t1, int[] t2, int k) {
        long ans=0;
        int n=t1.length;
        int[][] arr= new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=t2[i]-t1[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->b[0]-a[0]);
        int i=n-1;
        while(k>0){
            int ind= arr[i][1];
            ans+=t1[ind];
            k--;
            i--;
        }
        while(i>=0){
            int ind= arr[i][1],val=arr[i][0];
            if(val<=0){
                ans+=t1[ind];
            }
            else ans+=t2[ind];
            i--;
        }
        return ans;
    }
}