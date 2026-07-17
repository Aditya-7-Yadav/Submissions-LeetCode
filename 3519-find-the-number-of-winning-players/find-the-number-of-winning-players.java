class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        List<List<Integer>> al= new ArrayList<>();
        for(int i=0;i<n+1;i++)al.add(new ArrayList<>());
        for(int i=0;i<pick.length;i++){
            int p1=pick[i][0],
            c1=pick[i][1];
            al.get(p1).add(c1);
        }
        int ans=0;
        for(int i=0;i<n+1;i++){
            if(i==0 && al.get(0).size()>0){
                ans++;
                continue;
            }
            else if(al.get(i).size()<=i)continue;
            HashMap<Integer,Integer> hm = new HashMap<>();
            boolean fl=false;
            for(int j : al.get(i)){
                int num=hm.getOrDefault(j,0);
                if(num+1>i){
                    fl=true;
                    break;
                }
                hm.put(j,num+1);
            }
            if(fl)ans++;
        }
        return ans;
    }
}