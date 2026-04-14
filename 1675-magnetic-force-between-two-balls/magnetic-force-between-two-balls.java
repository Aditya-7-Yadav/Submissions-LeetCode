class Solution {
    public int maxDistance(int[] pos, int m) {
        int mid=0,low=1,n=pos.length;
        Arrays.sort(pos);
        int ans=0;
        int high=pos[n-1]-pos[0];
        while(low<=high){
            mid=(high+low)/2;
            if(posible(pos,mid,m)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    boolean posible(int[] pos,int n,int m){
        int i=0;
        while(i<pos.length-1 && m>1){
            int j=i+1;
            while(j<pos.length && pos[j]-pos[i]<n)j++;
            if(j>=pos.length)return false;
            m--;
            i=j;
        }
        if(m>1)return false;
        return true;
    }
}