class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int ans=Integer.MAX_VALUE;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=nums.length-1;i>-1;i--){
            int mir=0,og=nums[i];
            while(og>0){
                mir*=10;
                mir+=og%10;
                og/=10;
            }
            if(hm.containsKey(mir))ans=Math.min(ans,hm.get(mir)-i);
            hm.put(nums[i],i);
        }
        if(ans==Integer.MAX_VALUE)return -1;
        return ans;
    }
}