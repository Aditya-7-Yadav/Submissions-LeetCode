class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int i=0;
        Arrays.sort(costs);
        while(i<costs.length && coins>0){
            if(costs[i]<=coins){
                coins-=costs[i];
                i++;
            }
            else break;
        }
        return i;
    }
}