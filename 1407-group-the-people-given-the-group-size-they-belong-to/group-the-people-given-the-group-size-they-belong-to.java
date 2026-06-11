class Solution {
    public List<List<Integer>> groupThePeople(int[] grp) {
        HashMap<Integer,List<Integer>> hm= new HashMap<>();
        int n=grp.length;
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(grp[i])){
                hm.put(grp[i],new ArrayList<>());
            }
            else if(hm.get(grp[i]).size()==grp[i]){
                ans.add(hm.get(grp[i]));
                hm.put(grp[i],new ArrayList<>());
            }
            hm.get(grp[i]).add(i);
        }
        for(int sz:hm.keySet()){
            if(hm.get(sz).size()>0)ans.add(hm.get(sz));
        }
        return ans;
    }
}