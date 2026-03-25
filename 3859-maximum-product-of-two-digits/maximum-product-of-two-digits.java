class Solution {
    public int maxProduct(int n) {
        int ans=0,h1=0,h2=0;
        while(n>0){
            int temp=n%10;
            if(temp>=h1){
                h2=h1;
                h1=temp;
            }
            else if(temp>h2)h2=temp;
            n=n/10;
        }
        return h1*h2;
    }
}