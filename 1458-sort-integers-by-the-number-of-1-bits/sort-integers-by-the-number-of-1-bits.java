class Solution {
    public int[] sortByBits(int[] arr) {
        List<List<Integer>> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int n=0,num=arr[i];
            while(num>0){
                n+=num&1;
                num=num>>1;
            }
            al.add(new ArrayList<>(Arrays.asList(arr[i],n)));
        }
        Collections.sort(al,(a,b)-> a.get(1).equals(b.get(1)) ? a.get(0)-b.get(0) : a.get(1)-b.get(1));
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++)ans[i]=al.get(i).get(0);
        return ans;


    }
}