class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int ans=0,mid=0,low=1,high=10000000;
        for(int i=0;i<dist.length;i++){
            high=Math.max(high,dist[i]);
        }
        while(low<=high){
            mid=(high+low)/2;
            if(posi(dist,hour,mid)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        if(ans==0) return -1;
        return ans;
    }
    boolean posi(int[] dist,double h,int sp){
        double curr=0;
        for(int i=0;i<dist.length-1;i++){
            curr+=Math.ceil((double)dist[i]/sp);
            if(curr>h)return false;
        }
        curr+=(double)dist[dist.length-1]/sp;
        return curr<=h;
    }
}