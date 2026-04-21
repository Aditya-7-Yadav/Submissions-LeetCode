class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;
        int[] p = new int[n];
        for(int i=0;i<n;i++) p[i]=i;

        for(int i=0;i<allowedSwaps.length;i++){
            union(p, allowedSwaps[i][0], allowedSwaps[i][1]);
        }

        HashMap<Integer, HashMap<Integer,Integer>> hm = new HashMap<>();

        for(int i=0;i<n;i++){
            int par = find(p,i);
            hm.putIfAbsent(par,new HashMap<>());
            HashMap<Integer,Integer> freq = hm.get(par);
            freq.put(source[i], freq.getOrDefault(source[i],0)+1);
        }

        int ans = 0;

        for(int i=0;i<n;i++){
            int par = find(p,i);
            HashMap<Integer,Integer> freq = hm.get(par);
            if(freq.getOrDefault(target[i],0)>0){
                freq.put(target[i], freq.get(target[i])-1);
            } else ans++;
        }

        return ans;
    }

    int find(int[] p,int x){
        if(p[x]!=x) p[x]=find(p,p[x]);
        return p[x];
    }

    void union(int[] p,int a,int b){
        int pa = find(p,a);
        int pb = find(p,b);
        if(pa!=pb) p[pa]=pb;
    }
}