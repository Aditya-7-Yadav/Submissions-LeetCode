class Solution {
    public int minJumps(int[] nums) {
        int n=nums.length;
        if(n==1)return 0;

        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();

        for(int i=0;i<n;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],new ArrayList<Integer>());
            }
            hm.get(nums[i]).add(i);
        }

        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[n];

        q.add(0);
        vis[0]=true;

        int steps=0;

        while(!q.isEmpty()){

            int size=q.size();

            while(size-->0){

                int curr=q.poll();

                if(curr==n-1)return steps;

                if(curr-1>=0 && !vis[curr-1]){
                    vis[curr-1]=true;
                    q.add(curr-1);
                }

                if(curr+1<n && !vis[curr+1]){
                    vis[curr+1]=true;
                    q.add(curr+1);
                }
                ArrayList<Integer> al=hm.get(nums[curr]);
                for(int i=0;i<al.size();i++){

                    int idx=al.get(i);

                    if(!vis[idx]){
                        vis[idx]=true;
                        q.add(idx);
                    }
                }
                hm.get(nums[curr]).clear();
            }
            steps++;
        }
        return -1;
    }
}