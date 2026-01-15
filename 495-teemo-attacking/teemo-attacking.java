class Solution {
    public int findPoisonedDuration(int[] ti,int dur){
        int ans=0;
        for(int i=0;i<ti.length;i++){
            if(i+1<ti.length)ans+=Math.min(dur,ti[i+1]-ti[i]);
            else ans+=dur;
        }
        return ans;
    }
}
