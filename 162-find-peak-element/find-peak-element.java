class Solution {
    public int findPeakElement(int[] nums) {
        // int n = nums.length;
        // int max = Integer.MIN_VALUE;
        // int a = 0;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] > max) {
        //         max = nums[i];
        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] == max) {
        //         a = i;
        //     }
        // }
        // return a;

        int n = nums.length;
        if(n == 1){
            return 0;
        }
        if(nums[0] > nums[1]){
            return 0;
        }
        if(nums[n-1] > nums[n-2]){
            return n-1;
        }
        int low = 1;
        int high = n-2;
        while(low <= high){
            int mid = (low+high)/ 2;
            if((nums[mid] > nums[mid -1]) && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(nums[mid] > nums[mid - 1]){
                low =  mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}