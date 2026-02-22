class Solution {
    public int binaryGap(int n) {
        int ans=0,prev=-1,temp=0;
        while(n>0){
            int num=n&1;
            n=n>>1;
            if(prev>=0 && num==1){
                ans=Math.max(ans,temp-prev);
            }
            if(num==1)prev=temp;
            temp++;
        }
        return ans;
    }
}