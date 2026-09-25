class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st= new Stack<>();
        int n=nums.length;
        long curr=0;
        for(int i=0;i<n;i++){
            curr=nums[i];
            while(!st.isEmpty() && st.peek()==curr){
                curr+=st.pop();
            }
            st.push(curr);
        }
        List<Long> ans= new ArrayList<>();
        while(!st.isEmpty())ans.add(st.pop());
        Collections.reverse(ans);
        return ans;
    }
}