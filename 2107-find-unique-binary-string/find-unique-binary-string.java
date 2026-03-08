class Solution{
    public String findDifferentBinaryString(String[] nums){
        int n=nums.length;
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<n;i++)hs.add(nums[i]);
        for(int i=0;i<=n;i++){
            String s=Integer.toBinaryString(i);
            while(s.length()<n)s="0"+s;
            if(!hs.contains(s))return s;
        }
        return "";
    }
}
