import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        BigInteger num = new BigInteger(s, 2);
        int ans=0;
        while(num.compareTo(BigInteger.ONE)>0){
            if(num.testBit(0))num=num.add(BigInteger.ONE);
            else num=num.shiftRight(1);
            ans++;
        }
        return ans;
        
    }
}