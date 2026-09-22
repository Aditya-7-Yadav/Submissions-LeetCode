class Solution {
    public int findComplement(int num) {
        int ans=0;
        int mul=1;
        while(num>0){
            int bit=num&1;
            num=num>>1;
            if(bit==0)ans+=mul;
            mul*=2;
        }
        return ans;
    }
}