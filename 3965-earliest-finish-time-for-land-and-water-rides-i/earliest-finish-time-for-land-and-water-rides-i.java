class Solution {
    public int earliestFinishTime(int[] lst, int[] ldur, int[] wst, int[] wdur) {
        int ans=9999999;
        for(int i=0;i<lst.length;i++){
            int end=lst[i]+ldur[i];
            for(int j=0;j<wdur.length;j++){
                
                    if(wst[j]<=end)ans=Math.min(ans,end+wdur[j]);
                    else ans=Math.min(ans,wdur[j]+wst[j]);
                
            }
        }
        for(int i=0;i<wst.length;i++){
            int end=wst[i]+wdur[i];
            for(int j=0;j<ldur.length;j++){
                
                    if(lst[j]<=end)ans=Math.min(ans,end+ldur[j]);
                    else ans=Math.min(ans,ldur[j]+lst[j]);
                
            }
        }
        return ans;
    }
}