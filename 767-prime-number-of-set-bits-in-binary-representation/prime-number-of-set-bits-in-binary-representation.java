class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans=0,i=left;
        while(i<=right){
            int n=i;            
                int temp=0;
            while(n>0){
                temp+=n&1;
                n=n>>1;
              
            }
              if(temp==2 || temp==3 || temp==5 || temp==7 || temp==11 || temp==13|| temp==17 || temp==19)ans++;
              i++;
        }
        return ans;
    }
}