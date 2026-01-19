class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> s1= new Stack<>();
        int n=nums.length;
        int k=Integer.MIN_VALUE;
        for(int i=n-1;i>-1;i--){
            if(nums[i]<k)return true;
            while(!s1.isEmpty() && s1.peek()<nums[i])k=s1.pop();
            s1.push(nums[i]);
        }
        return false;
    }
}