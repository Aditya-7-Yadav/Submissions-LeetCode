class Solution {
    public long sumDigitDifferences(int[] nums) {
        int n=nums.length,m=(nums[0]+"").length();
        long[][] freq= new long[m][11];
        long ans=0;
        for(int i=0;i<n;i++){
            int num= nums[i],j=0;
            while(num>0){
                freq[j][num%10]++;
                freq[j][10]++;
                num/=10;
                j++;
            }
        }
        for(int i=0;i<m;i++){
            long tot=freq[i][10];
            for(int j=0;j<10;j++)if(freq[i][j]>0)ans+=freq[i][j]*(tot-freq[i][j]);
        }

        return ans/2;
    }
}