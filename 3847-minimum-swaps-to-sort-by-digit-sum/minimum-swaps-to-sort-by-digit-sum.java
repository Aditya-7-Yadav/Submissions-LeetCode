class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            int num=nums[i],tot=0;
            while(num>0){
                tot+=num%10;
                num/=10;
            }
            arr[i][0]=tot;
            arr[i][1]=nums[i];
        }
        Arrays.sort(arr,(a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
        int ans=0;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)hm.put(nums[i],i);
        for(int i=0;i<n;i++){
            if(nums[i]!=arr[i][1]){
                int j=hm.get(arr[i][1]);
                hm.put(nums[i],j);
                hm.put(arr[i][1],i);
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                ans++;
            }
        }
        return ans;
    }
}