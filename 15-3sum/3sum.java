import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        if(nums[0]>0)return ans;
        for(int i=0;i<n-2 && nums[i]<=0;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int temp=-1*nums[i];
            int lf=i+1,rt=n-1;
            while(lf<rt){
                int sum=nums[lf]+nums[rt];
                if(sum== temp){
                    List<Integer> tempo= new ArrayList<>();
                    tempo.add(nums[i]);
                    tempo.add(nums[lf]);
                    tempo.add(nums[rt]);
                    ans.add(tempo);
                    lf++;
                    rt--;
                    while(lf<rt && nums[lf]==nums[lf-1]) lf++;
                    while(lf<rt && nums[rt]==nums[rt+1]) rt--;
                }
                else if(sum>temp)rt--;
                else lf++;
            }
        }
        return ans;
    }
}
