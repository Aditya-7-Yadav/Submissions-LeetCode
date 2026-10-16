class Solution {
    public int numOfPairs(String[] nums, String t) {
        Map<String,Integer> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++)hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        int ans=0,n=t.length();
        for(int i=1;i<n;i++){
            String p1=t.substring(0,i),p2=t.substring(i,n);
            if(p1.equals(p2)){
                int num=hm.getOrDefault(p1,0);
                if(num>=2)ans+= num * (num-1);
            }
            else{
                int num1=hm.getOrDefault(p2,0),num2=hm.getOrDefault(p1,0);
                if(num1>0 && num2>0) ans+= (num1*num2);
            }
        }


        return ans;
    }
}