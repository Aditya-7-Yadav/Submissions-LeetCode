class Solution {
    public int largestRectangleAreaa(int[] nums) {
        int n=nums.length;
        Stack<Integer> st1= new Stack<>();
        Stack<Integer> st2= new Stack<>();
        int[] pse=new int[n];
        int[] nse=new int[n];
        for(int i=0;i<n;i++){
            while(st1.size()>0 && nums[st1.peek()]>=nums[n-1-i]) st1.pop();
            if(st1.size()==0)nse[n-1-i]=n;
            else nse[n-1-i]=st1.peek();
            st1.push(n-1-i);
            while(st2.size()>0 && nums[st2.peek()]>=nums[i]) st2.pop();
            if(st2.size()==0)pse[i]=-1;
            else pse[i]=st2.peek();
            st2.push(i);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,(nums[i]*(nse[i]-1-pse[i])));
        }
        return ans;
    }
    public int maximalRectangle(char[][] matrix) {
        int[] arr=new int[matrix[0].length];
        int ans=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='0')arr[j]=0;
                else
                arr[j]+=1;
            }
            ans=Math.max(ans,largestRectangleAreaa(arr));
        }
        return ans;
    }
}