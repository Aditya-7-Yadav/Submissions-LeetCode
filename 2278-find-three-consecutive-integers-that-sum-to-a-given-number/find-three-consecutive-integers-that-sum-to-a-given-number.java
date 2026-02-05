class Solution {
    public long[] sumOfThree(long num) {
        
        if((num)%3!=0)
        return new long[0];
        long i=(num)/3;
        
        return new long[]{i-1,i,i+1};

    }
}