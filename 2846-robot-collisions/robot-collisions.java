class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> ans= new ArrayList<>();
        int[][] nums= new int[positions.length][4];
        for(int i=0;i<nums.length;i++){
            nums[i][0]=positions[i];
            nums[i][1]=healths[i];
            if(directions.charAt(i)=='R')nums[i][2]=1;
            else nums[i][2]=-1;
            nums[i][3]=i;
        }
        Arrays.sort(nums, (a, b) -> a[0] - b[0]);
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[i][2]==-1 && nums[st.peek()][2]==1 && nums[st.peek()][1]<nums[i][1] && nums[i][1]>0){
                nums[i][1]--;
                nums[st.peek()][1]=0;
                st.pop();
            }
            if(!st.isEmpty() && nums[i][1]==nums[st.peek()][1] && nums[i][2]==-1 && 1==nums[st.peek()][2]){
                nums[st.peek()][1]=0;
                nums[i][1]=0;
                st.pop();
                continue;
        }
         if(!st.isEmpty() && nums[i][1]<nums[st.peek()][1] && nums[i][2]==-1 && 1==nums[st.peek()][2]){
            nums[st.peek()][1]--;
            nums[i][1]=0;
                continue;
        }
            if(nums[i][1]>0)st.push(i);
        }
        Arrays.sort(nums, (a, b) -> a[3] - b[3]);
        for(int i=0;i<nums.length;i++){
            if(nums[i][1]>0)ans.add(nums[i][1]);
        }
        return ans;
    }
}