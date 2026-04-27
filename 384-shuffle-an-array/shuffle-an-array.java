class Solution {
    int[] arr;
    int[] og;
    public Solution(int[] nums) {
        arr=nums;
        og=nums.clone();
    }
    public int[] reset() {
        return og;
    }
    public int[] shuffle() {
        int n=arr.length;
        Set<Integer> hs= new HashSet<>();
        for(int i=0;i<n;i++){
            while(true){
                int id= (int)(Math.random()*(n));
                if(hs.contains(id))continue;
                else{
                    arr[i]=og[id];
                    hs.add(id);
                    break;
                }
            }
        }
       return arr; 
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */