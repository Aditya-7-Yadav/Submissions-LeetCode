class Solution {
    public int missingInteger(int[] nums) {
        int ans=0,sum=nums[0];
        HashSet<Integer> hs= new HashSet<>();
        int i=0,n=nums.length;
            while(i<n-1 && nums[i]+1==nums[i+1] ){
                sum+=nums[i+1];
                i++;
            }
            for(int j=0;j<n;j++){
                hs.add(nums[j]);
            }
            while(sum<=50*51){
                if(!hs.contains(sum))
                return sum;
                else 
                sum++;
            }
        
        return 51;
    }
}

