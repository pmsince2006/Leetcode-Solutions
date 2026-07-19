class Solution {
    public void sortColors(int[] nums) {
        // int i = 0;
        // int j = 0;
        // int k = nums.length - 1;
        // while (j <= k) {
            
        //     if (nums[j] == 0) {
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         i++;
        //         j++;
        //     }
        //     else if(nums[j] == 1){
        //         j++;
        //     }
        //     else{
        //         int temp = nums[j];
        //         nums[j] = nums[k];
        //         nums[k] = temp;    
        //         k--;
        //     }
        // }

        int low = 0, mid = 0, high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
}