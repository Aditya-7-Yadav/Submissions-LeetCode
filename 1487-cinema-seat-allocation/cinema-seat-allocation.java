class Solution {
    public int maxNumberOfFamilies(int n,int[][] res) {
        int ans=2*n;
        HashMap<Integer,HashSet<Integer>> hm=new HashMap<>();

        for(int[] r:res){
            hm.computeIfAbsent(r[0],k->new HashSet<>()).add(r[1]);
        }

        for(HashSet<Integer> hs:hm.values()){
            boolean a=!hs.contains(2)&&!hs.contains(3)&&!hs.contains(4)&&!hs.contains(5);
            boolean b=!hs.contains(4)&&!hs.contains(5)&&!hs.contains(6)&&!hs.contains(7);
            boolean c=!hs.contains(6)&&!hs.contains(7)&&!hs.contains(8)&&!hs.contains(9);

            if(a&&c) continue;
            if(a||b||c) ans--;
            else ans-=2;
        }

        return ans;
    }
}