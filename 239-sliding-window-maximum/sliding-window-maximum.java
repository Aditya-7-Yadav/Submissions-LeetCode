class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<k;i++)pq.add(new int[]{nums[i],i});
        int[] ans= new int[nums.length-k+1];
        int temp=1;
        ans[0]=pq.peek()[0];
        for(int i=k;i<nums.length;i++){
            while(pq.size()>0 && pq.peek()[1]<=i-k)pq.poll();   
            pq.add(new int[]{nums[i],i});
            ans[temp++]=pq.peek()[0];
        }
        return ans;
    }
}