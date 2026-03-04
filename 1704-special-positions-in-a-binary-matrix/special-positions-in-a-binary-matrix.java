class Solution {
    public int numSpecial(int[][] mat) {
        int ans=0;
        HashMap<Integer,Integer> hm1=  new HashMap<>();
        HashMap<Integer,Integer> hm2=  new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                hm1.put(i,hm1.getOrDefault(i,0)+1);
                hm2.put(j,hm2.getOrDefault(j,0)+1);
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                if(hm1.get(i)==1 && hm2.get(j)==1)ans++;
                }
            }
        }
        return ans;
    }
}