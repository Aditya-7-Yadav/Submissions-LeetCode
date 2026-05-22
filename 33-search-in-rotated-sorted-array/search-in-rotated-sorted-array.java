class Solution {
    public int binarySearch(int[] nums, int target, int min, int max) {
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
