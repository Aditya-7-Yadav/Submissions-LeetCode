class Solution {
    public int search(int[] nums, int tar) {
        int fs= 0, ls= nums.length - 1;
        while(fs<=ls){
            int mid=(ls+fs)/2;
            if(nums[mid]==tar)return mid;
            if(nums[fs]<= nums[mid]){
            if(nums[fs]<= tar && tar <nums[mid])
                ls =mid - 1;
            else
                fs = mid+1;
        }
        else{
            if(nums[mid]< tar && tar<= nums[ls])
                fs =mid + 1;
            else
                ls = mid -1;
        }
        }
        return -1;
    }
}
