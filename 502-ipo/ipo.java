class Solution {
    public int findMaximizedCapital(int k, int w, int[] prof, int[] cap) {
        int ans=w;
        PriorityQueue<int[]> pq1=new PriorityQueue<>((a,b)->a[0]-b[0]);
        PriorityQueue<Integer> pq2=new PriorityQueue<>((a,b)->b-a);

        for(int i=0;i<prof.length;i++){
            pq1.add(new int[]{cap[i],prof[i]});
        }
        while(k>0 ){
        while(!pq1.isEmpty() && pq1.peek()[0]<=w) pq2.offer(pq1.poll()[1]);
        if(pq2.isEmpty()) break;
            int pp=pq2.poll();
            w+=pp;
            ans+=pp;
            k--;
        
        
        }
         return ans;
    }
}