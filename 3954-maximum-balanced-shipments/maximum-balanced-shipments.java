class Solution {
    public int maxBalancedShipments(int[] w) {
        int ans=0, high=0;
        for(int i=0;i<w.length;i++){
            if(w[i]<high){
                ans++;
                if(i<w.length-1)high=w[i+1];
                continue;
            }
            
            high=Math.max(high,w[i]);
        }
        return ans;
    }
}