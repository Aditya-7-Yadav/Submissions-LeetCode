class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev=n&1;
        n=n>>1;
        while(n>0){
            int num= n&1;
            if(num==prev)return false;
            prev=num;
            n=n>>1;
        }
        return true;
    }
}