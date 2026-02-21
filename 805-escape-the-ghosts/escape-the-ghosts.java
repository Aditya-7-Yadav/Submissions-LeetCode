class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int dist= Integer.MAX_VALUE;
        for(int i=0;i<ghosts.length;i++){
            dist= Math.min(dist,Math.abs(ghosts[i][0]-target[0])+Math.abs(ghosts[i][1]-target[1]));
        }
        if(dist<=Math.abs(target[0])+Math.abs(target[1]))return false;
        return true;
    }
}