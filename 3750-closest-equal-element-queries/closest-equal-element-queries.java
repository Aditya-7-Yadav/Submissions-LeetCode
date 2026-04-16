class Solution {
    public List<Integer> solveQueries(int[] nums, int[] q) {
        HashMap<Integer,ArrayList<Integer>> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.putIfAbsent(nums[i], new ArrayList<>());
        }
        for(int i=0;i<nums.length;i++)hm.get(nums[i]).add(i);
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<q.length;i++){
            if(hm.get(nums[q[i]]).size()<2)ans.add(-1);
            else{
                ArrayList<Integer> al=hm.get(nums[q[i]]);
                int high=al.size()-1,low=0,mid=0;
                while(low<=high){
                    mid=(low+high)/2;
                    if(al.get(mid)==q[i]) break;
                    else if(al.get(mid)<q[i]) low=mid+1;
                    else high=mid-1;
                }
                int m = al.size(),n=nums.length;
                int prev = al.get((mid-1+m)%m);
                int next = al.get((mid+1)%m);
                int d1 = Math.min(Math.abs(q[i]-prev), n-Math.abs(q[i]-prev));
                int d2 = Math.min(Math.abs(q[i]-next), n-Math.abs(q[i]-next));

                ans.add(Math.min(d1,d2));
            }
    }
        return ans;
    }
}