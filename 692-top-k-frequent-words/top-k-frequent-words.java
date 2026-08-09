class Solution {
    public List<String> topKFrequent(String[] w, int k) {
        List<String> ans = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();

        for(int i = 0; i < w.length; i++){
            String s = w[i];
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> {
            if(!a.getValue().equals(b.getValue()))
                return a.getValue() - b.getValue();
            return b.getKey().compareTo(a.getKey());
        });

        for(Map.Entry<String, Integer> e : hm.entrySet()){
            pq.offer(e);
            if(pq.size() > k)
                pq.poll();
        }

        while(!pq.isEmpty())
            ans.add(pq.poll().getKey());

        Collections.reverse(ans);

        return ans;
    }
}