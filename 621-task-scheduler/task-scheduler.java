class Solution{
    public int leastInterval(char[] tasks,int n){
        int[] freq=new int[26];
        for(char c:tasks)freq[c-'A']++;

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int x:freq)if(x>0)pq.add(x);

        int ans=0;

        while(!pq.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            int k=n+1;

            while(k>0 && !pq.isEmpty()){
                int x=pq.poll();
                x--;
                if(x>0)temp.add(x);
                ans++;
                k--;
            }

            for(int x:temp)pq.add(x);

            if(pq.isEmpty())break;

            ans+=k;
        }

        return ans;
    }
}
