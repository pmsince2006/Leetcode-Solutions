class Solution {

    public int solve(int amount, int[] coins, int n, int[][] dp) {

        if (amount == 0) {
            return 0;
        }

        if (n == 0 || amount < 0) {
            return Integer.MAX_VALUE - 1;
        }

        if (dp[amount][n] != -1) {
            return dp[amount][n];
        }

        if (coins[n - 1] <= amount) {

            int inc = 1 + solve(amount - coins[n - 1], coins, n, dp);
            int ex = solve(amount, coins, n - 1, dp);

            dp[amount][n] = Math.min(inc, ex);
        } else {
            dp[amount][n] = solve(amount, coins, n - 1, dp);
        }

        return dp[amount][n];
    }

    public int coinChange(int[] coins, int amount) {

        int n = coins.length;

        int[][] dp = new int[amount + 1][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int res = solve(amount, coins, n, dp);

        return res == Integer.MAX_VALUE - 1 ? -1 : res;
    }
}