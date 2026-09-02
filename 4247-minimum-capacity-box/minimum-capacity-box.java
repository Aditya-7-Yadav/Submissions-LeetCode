class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int ans=-1,diff=99999;
        for(int i=0;i<capacity.length;i++){
            int temp=capacity[i]-itemSize;
            if(temp>=0 && temp<diff){
            ans=i;
            diff=temp;
        }
        }
        return ans;
    }
}