class Solution {
    public int[] countBits(int n) {
        int[] ans= new int[n+1];
        for(int i=0;i<n+1;i++){
            int temp=i;
            int anss=0;
            if(i%2==1)anss=ans[i-1]+1;
            else{
            while(temp>0){
                anss+=(temp&1);
                temp=temp>>1;
            }
            }
            ans[i]=anss;
        }
        return ans;
    }
}