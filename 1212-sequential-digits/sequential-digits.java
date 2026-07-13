class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans= new ArrayList<>();
        String s= "123456789";
        for(int i=0;i<9;i++){
            for(int j=0;j<9-i;j++){
                int num=Integer.parseInt(s.substring(j,j+i+1));
                if(num>=low && num<=high)ans.add(num);
            }
        }
        return ans;
    }
}