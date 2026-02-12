class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        int ans=0;
        Map<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<arr.length;i++)hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        List<Integer> al= new ArrayList<>();
        hm.forEach((kk,v)->{
            al.add(v);
        });
        Collections.sort(al);
        while(ans<al.size() && k>0){
            if(al.get(ans)<=k){
                k-=al.get(ans);
                ans++;
            }
            else break;
        }
        return al.size()-ans;
    }
}