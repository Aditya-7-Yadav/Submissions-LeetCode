class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int ii=Math.max(100,num1);ii<=num2;ii++){
            int n=ii;
            ArrayList<Integer> arr= new ArrayList<>();
            while(n>0){
                arr.add(n%10);
                n/=10;
            }
            for(int i=1;i<arr.size()-1;i++){
                if((arr.get(i-1)<arr.get(i) && arr.get(i+1)<arr.get(i)) || (arr.get(i-1)>arr.get(i) && arr.get(i+1)>arr.get(i))){
                    ans++;
                }
            }
        }
        return ans;
    }
}