class Solution {
    public int largestInteger(int[] nums, int kk) {
        int ans=0,f1=1,f2=1,n=nums.length;
        if(kk==1 || kk==n){
            int mx=-1;
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<n;i++){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
                mx=Math.max(mx,nums[i]);
            }
            if(kk==n)return mx;
            mx=-1;
            for(int k: hm.keySet())if(hm.get(k)==1)mx=Math.max(mx,k);
            return mx;
        }
        for(int i=1;i<n-1;i++){
            if(nums[0]==nums[i])f1=0;
            if(nums[n-1]==nums[i])f2=0;
        }
        
        if(kk<n && nums[0]==nums[n-1]) return -1;
        
        if(f1==1 && f2==0)return nums[0];
        else if(f2==1 && f1==0)return nums[n-1];
        else if(f1==1 && f2==1)return Math.max(nums[0],nums[n-1]);
        return -1;
    }
}