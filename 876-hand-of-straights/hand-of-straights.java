class Solution {
    public boolean isNStraightHand(int[] hnd, int gs) {
        if(hnd.length%gs!=0)return false;
        int n=hnd.length/gs;
        int[][] crd=new int[n][gs];
        Arrays.sort(hnd);
        int[] curr=new int[n];
        for(int i=0;i<hnd.length;i++){
            boolean fl=false;
            for(int j=0;j<n;j++){
                if(curr[j]==0){
                    crd[j][curr[j]]=hnd[i];
                    curr[j]++;
                    fl=true;
                    break;
                }
                else if(hnd[i]-crd[j][curr[j]-1]==1 && curr[j]<gs){
                    crd[j][curr[j]]=hnd[i];
                    curr[j]++;
                    fl=true;
                    break;
                }
                
            }
            if(!fl)return false;
        }
        return true;
    }
}