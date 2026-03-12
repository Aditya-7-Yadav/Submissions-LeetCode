class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> ans = new ArrayList<>();
        Map<String,Integer> hm= new HashMap<>();
        for(int i=0;i<cpdomains.length;i++){
            String[] arrr=cpdomains[i].split(" ");
            String[] arr=arrr[1].split("\\.");
            int val= Integer.parseInt(arrr[0]);
            StringBuilder sb = new StringBuilder();
            sb.append(arr[arr.length-1]);
            hm.put(sb.toString(),hm.getOrDefault(sb.toString(),0)+val);
            for(int j=arr.length-2;j>-1;j--){
                sb.insert(0,".");
                sb.insert(0,arr[j]);
                hm.put(sb.toString(),hm.getOrDefault(sb.toString(),0)+val);
            }
        }
        hm.forEach((k,v)->{
            StringBuilder sb= new StringBuilder(v.toString()+" ");
            sb.append(k);
            ans.add(sb.toString());
        });
        return ans;
    }
}