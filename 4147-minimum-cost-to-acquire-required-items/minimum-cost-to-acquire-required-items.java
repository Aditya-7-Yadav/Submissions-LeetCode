
class Solution {
    public long minimumCost(int c1, int c2, int c3, int n1, int n2) {
        long ans=0;
        
        long a=(long)n1*c1+(long)n2*c2;
        long b=(long)Math.min(n1,n2)*c3+(long)Math.max(0,n1-n2)*c1+(long)Math.max(0,n2-n1)*c2;
        long c=(long)Math.max(n1,n2)*c3;
        
        return Math.min(a,Math.min(b,c));
    }
}
