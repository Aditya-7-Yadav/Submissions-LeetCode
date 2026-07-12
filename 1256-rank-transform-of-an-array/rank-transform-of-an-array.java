class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> hm= new HashMap<>();
        int[] ans= Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        int rnk=1;
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i-1]!=arr[i])rnk++;
            hm.put(arr[i],rnk);
        }
        for(int i=0;i<arr.length;i++)ans[i]=hm.get(ans[i]);
        return ans;
    }
}