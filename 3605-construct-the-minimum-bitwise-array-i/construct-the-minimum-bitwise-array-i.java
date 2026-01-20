class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=-1;
            int a=1,num=nums.get(i);
            while(a<num){
                if((a | a+1)==num){
                    ans[i]=a;
                    break;
                }
                a++;
            }
        }
        return ans;
    }
}