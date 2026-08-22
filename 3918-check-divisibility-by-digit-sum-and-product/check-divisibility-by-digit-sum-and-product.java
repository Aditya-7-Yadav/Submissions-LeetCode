class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,num=n,prod=1;
        while(n>0){
            sum+=n%10;
            prod*=n%10;
            n=n/10;
        }
        sum+=prod;
        return (num%sum==0);
    }
}