class Solution {
    public char kthCharacter(long k, int[] op) {
        return (char)('a'+trav(k,op.length-1,op));
    }
    int trav(long k,int i,int[]op){
        if(i==0){
            if(op[0]==0)return 0;
            if(k==2)return 1;
            return 0;
        }
        int n=i+1;
        long size=(long)Math.pow(2,n);
        if(op[i]==0){
            if(k<=size/2)return trav(k,i-1,op);
            return trav(k-size/2,i-1,op);
        }
        if(k<=size/2)return (trav(k,i-1,op))%26;
        return (1+trav(k-size/2,i-1,op))%26;

    }
}
// 0
// 00
// 0011
// 0
// 01
// 0101