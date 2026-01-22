class Solution {
    public int minimumPairRemoval(int[] nums) {
        int ans=0;
        List<Integer> al= new ArrayList<>();
        for(int i=0;i<nums.length;i++)al.add(nums[i]);
        while(ans<nums.length){
            int minn=Integer.MAX_VALUE;
            int j=0;
            int n=al.size();
            boolean br=true;
            for(int i=0;i<n-1;i++){
                if(al.get(i)+al.get(i+1)<minn){
                    minn=al.get(i)+al.get(i+1);
                    j=i;
                }
                br=br && (al.get(i)<=al.get(i+1));
            }
            if(br)break;
            ans++;
            
            al.remove(j+1);
            al.remove(j);
            al.add(j,minn);
        }
        return ans;
    }
}