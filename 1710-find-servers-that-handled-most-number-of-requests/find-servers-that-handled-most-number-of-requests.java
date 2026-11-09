class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        List<Integer> ans= new ArrayList<>();
        TreeSet<Integer> ts= new TreeSet<>();
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->a[0]-b[0]);
        int[] cnt= new int[k];

        for(int i=0;i<k;i++)ts.add(i);

        for(int i=0;i<arrival.length;i++){
            while(!pq.isEmpty() && pq.peek()[0]<=arrival[i]){
                ts.add(pq.poll()[1]);
            }

            if(ts.isEmpty())continue;

            Integer s=ts.ceiling(i%k);

            if(s==null)s=ts.first();

            ts.remove(s);
            cnt[s]++;
            pq.add(new int[]{arrival[i]+load[i],s});
        }

        int max=0;
        for(int i=0;i<k;i++){
            max=Math.max(max,cnt[i]);
        }

        for(int i=0;i<k;i++){
            if(cnt[i]==max)ans.add(i);
        }

        return ans;
    }
}