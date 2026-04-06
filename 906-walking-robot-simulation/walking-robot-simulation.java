class Solution {
    public int robotSim(int[] com, int[][] obs) {
        int ans=0;
        Set<ArrayList<Integer>> hs= new HashSet<>();
        for(int i=0;i<obs.length;i++)hs.add(new ArrayList<>(Arrays.asList(obs[i][0], obs[i][1])));
        int dir=0;
        int[] curr=new int[2];
        boolean fl=hs.contains(new ArrayList<>(Arrays.asList(0, 0)));
        if(fl){
            hs.remove(new ArrayList<>(Arrays.asList(0, 0)));
        }
        for(int i=0;i<com.length;i++){
            if(com[i]==-1)dir=(dir+1)%4;
            else if(com[i]==-2)dir=(dir-1+4)%4;
            else{
                if(dir==3){
                while(com[i]>0){
                    curr[0]--;
                    com[i]--;
                    if(hs.contains(new ArrayList<>(Arrays.asList(curr[0], curr[1])))){
                        curr[0]++;
                        break;
                    }
                }
                }
                else if(dir==0){
                    while(com[i]>0  ){
                    curr[1]++;
                    com[i]--;
                    if(hs.contains(new ArrayList<>(Arrays.asList(curr[0], curr[1])))){
                        curr[1]--;
                        break;
                    }
                }
                }
                
                else if(dir==2){
                    while(com[i]>0 ){
                    curr[1]--;
                    com[i]--;
                    if(hs.contains(new ArrayList<>(Arrays.asList(curr[0], curr[1])))){
                        curr[1]++;
                        break;
                    }
                }
                }
                else{
                    while(com[i]>0  ){
                    curr[0]++;
                    com[i]--;
                    if(hs.contains(new ArrayList<>(Arrays.asList(curr[0], curr[1])))){
                        curr[0]--;
                        break;
                    }
                }
                }
                ans=Math.max(ans,(curr[0]*curr[0])+(curr[1]*curr[1]));
                if(fl)hs.add(new ArrayList<>(Arrays.asList(0, 0)));
                }
            }
            return ans;
        }
    }