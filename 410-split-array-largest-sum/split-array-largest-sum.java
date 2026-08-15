class Solution {
    public int splitArray(int[] nums, int k) {
        
        long low = 0;
        long high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low < high) {

            long mid = low + (high - low) / 2;

            int subarrays = 1;
            long sum = 0;

            for (int num : nums) {

                if (sum + num <= mid) {
                    sum += num;
                } else {
                    subarrays++;
                    sum = num;
                }
            }

            if (subarrays <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return (int) low;
    }
}