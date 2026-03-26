class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int sum=0,n=nums.length;
        int[] prv=new int[n];
        for(int i=0;i<n;i++){
            sum+=nums[i];
            prv[i]=sum;
        }
        int[] nxt= new int[n];
        sum=0;
        for(int i=n-1;i>-1;i--){
            sum+=nums[i];
            nxt[i]=sum;
        }
        nums[0]=nxt[1]-nums[0]*(n-1);
        nums[n-1]=nums[n-1]*(n-1) -prv[n-2];
        for(int i=1;i<n-1;i++){
            nums[i]=(nums[i]*(i))-prv[i-1]+ nxt[i+1] -(nums[i]*(n-i-1));
        }
        return nums;
    }
}