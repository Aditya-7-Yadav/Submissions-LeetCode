class Solution {
    public int minDeletion(int[] nums) {
        int ans=0,ind=0;
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(ind%2==1){
                int temp=-1;
                if(!st.isEmpty())temp=st.peek();
                while(i<nums.length && nums[i]==temp){
                    i++;
                    ans++;
                }
            }
            if(i<nums.length)st.push(nums[i]);
            ind++;
        }
        if(st.size()%2==1)ans++;
        return ans;
    }
}