class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1)return 0;
        if(n==2){
            if(k==1)return 0;
            return 1;
        }
        int size=(int)Math.pow(2,n-1);
        if(k<=size/2)return kthGrammar(n-1,k);
        return 1-kthGrammar(n-1,k-size/2);
    }
}