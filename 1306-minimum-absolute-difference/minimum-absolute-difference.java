class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minn=Integer.MAX_VALUE;
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            int diff=arr[i]-arr[i-1];
            if(diff<minn){
                ans.clear();
                minn=diff;
                List<Integer> temp= new ArrayList<>();
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(temp);
            }
            else if(diff==minn){
                 List<Integer> temp= new ArrayList<>();
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(temp);
            }
        }
        return ans;
    }
}