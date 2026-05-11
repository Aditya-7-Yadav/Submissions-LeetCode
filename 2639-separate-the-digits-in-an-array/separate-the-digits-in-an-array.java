class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            ArrayList<Integer> al2= new ArrayList<>();
            while(n>0){
                al2.add(n%10);
                n/=10;
            }
            for(int j=al2.size()-1;j>-1;j--)al.add(al2.get(j));
        }
        return al.stream().mapToInt(i -> i).toArray();
    }
}