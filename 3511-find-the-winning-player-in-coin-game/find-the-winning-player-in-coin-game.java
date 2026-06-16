class Solution {
    public String winningPlayer(int x, int y) {
        int ans=Math.min(x,y/4);
        if(ans%2==0)return "Bob";
        return "Alice";
    }
}