class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            arr[i][0] = nums[i];
            arr[i][1] = cost[i];
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        long total = 0;
        for(int i = 0; i < n; i++){
            total += cost[i];
        }
        long curr = 0;
        int med = 0;
        for(int i = 0; i < n; i++){
            curr += arr[i][1];
            if(curr * 2 >= total){
                med = arr[i][0];
                break;
            }
        }

        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += (long)Math.abs(nums[i] - med) * cost[i];
        }

        return ans;
    }
}