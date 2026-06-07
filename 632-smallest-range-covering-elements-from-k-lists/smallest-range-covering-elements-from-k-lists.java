class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] ans= new int[2];
        int mmax=Integer.MIN_VALUE,rng=9999999;
        PriorityQueue<int[]> pq1 = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        for(int i=0;i<nums.size();i++){
           pq1.offer(new int[]{nums.get(i).get(0), 0,i});
           mmax=Math.max(mmax,nums.get(i).get(0));
        }
        ans[0]=pq1.peek()[0];
        ans[1]=mmax;
        rng=mmax-ans[0];
        while(true){
            if(pq1.peek()[1]<nums.get(pq1.peek()[2]).size()-1){
                int[] in=pq1.poll();
                int ind=in[1], i=in[2];
                pq1.offer(new int[]{nums.get(i).get(ind+1), ind+1,i});
                int vall=pq1.peek()[0];
                mmax=Math.max(mmax,nums.get(i).get(ind+1));
                if(mmax-vall<rng){
                    rng=mmax-vall;
                    ans[0]=vall;
                    ans[1]=mmax;
                }
            }
            else break;
        }
        return ans;
    }
}