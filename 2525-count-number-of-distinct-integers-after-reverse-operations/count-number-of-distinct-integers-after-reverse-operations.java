class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> hs= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            hs.add(n);
            int temp=0;
            while(n>0){
                temp*=10;
                temp+=n%10;
                n=n/10;
            }
            hs.add(temp);
        }
        return hs.size();
    }
}