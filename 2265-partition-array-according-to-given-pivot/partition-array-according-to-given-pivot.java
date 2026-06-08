class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
         int small=0,eq=0,big=0,temp;
        int[] nums1= new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot)small++;
            else if(nums[i]>pivot)big++;
            else eq++;
        }
        big=small+eq;
        eq=small;
        small=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                nums1[small++]=nums[i];
            }
            else if(nums[i]>pivot){
                nums1[big++]=nums[i];
            }
            else {
                nums1[eq++]=nums[i];
        }
       
    }
     return nums1;
}
}

