class Solution {

    boolean possible(int[] arr, int day, int m, int k) {
        int cnt = 0;
        int noOfB = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += cnt / k;
                cnt = 0;
            }
        }

        // Count bouquets from the remaining consecutive flowers
        noOfB += cnt / k;

        return noOfB >= m;
    }

    public int minDays(int[] arr, int m, int k) {

        long val = (long) m * k;

        // Not enough flowers
        if (val > arr.length) {
            return -1;
        }

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        // Find minimum and maximum bloom day
        for (int i = 0; i < arr.length; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        int low = mini;
        int high = maxi;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (possible(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}