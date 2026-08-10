class Solution {
    static int binary(int low,int high,int[] nums, int target){
        if(low > high){
            return -1;
        }

        int mid = low + (high - low) / 2;

        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            return binary(mid+1,high,nums,target);
        }
        else{
            return binary(low,mid-1,nums,target);
        }
    }
    public int search(int[] nums, int target) {
        
        // Iterative Method
        // int low = 0;
        // int high = nums.length - 1;

        // while(low <= high){
        //     int mid = low + (high - low) / 2;

        //     if(nums[mid] == target){
        //         return mid;
        //     }
        //     else if(nums[mid] < target){
        //         low = mid + 1;
        //     }
        //     else{
        //         high = mid - 1;
        //     }
        // }
        // return -1;

        // Recursive Method
        return binary(0,nums.length - 1, nums, target);
    }
}