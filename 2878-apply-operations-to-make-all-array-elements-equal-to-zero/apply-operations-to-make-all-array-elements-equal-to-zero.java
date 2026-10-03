class Solution {
    public boolean checkArray(int[] nums, int k) {
        int n=nums.length;
        int[] d=new int[n+1];
        int op=0;
        for(int i=0;i<n;i++){
            op+=d[i];
            int x=nums[i]-op;
            if(x<0)
                return false;
            if(x>0){
                if(i+k>n)
                    return false;
                op+=x;
                d[i+k]-=x;
            }
        }
        return true;
    }
}