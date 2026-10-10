class Solution {
    public boolean canAliceWin(int n) {
        int curr=10;
        while(n>=0){
            n-= curr;
            if(n<0){
                return curr%2==1;
            }
            curr--;
        }
        return false;
    }
}