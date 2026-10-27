class Solution {
    public int solve(int amount, int[] coins, int n,int[][] dp){
        if(amount == 0){
            return 1;
        }
        if(n == 0 || amount < 0){
            return 0;
        }

        if(dp[amount][n] != -1){
            return dp[amount][n];
        }

        if(coins[n-1] <= amount){
           dp[amount][n] = solve(amount - coins[n - 1], coins, n, dp) + solve(amount, coins, n - 1, dp);
        }
        else{
            dp[amount][n] =  solve(amount,coins,n-1,dp);
        }
        return dp[amount][n];
    }

    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount+1][coins.length+1];

        for(int[] row : dp){
            Arrays.fill(row,-1);
        }

        return solve(amount, coins, coins.length,dp);
    }
}