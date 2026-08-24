class Solution {
    public int stoneGameVIII(int[] stones) {
        
        int n = stones.length;

        int[] prefix = new int[n];

        prefix[0] = stones[0];

        // first calculate the prefix
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + stones[i];
        }

        int diff = prefix[n-1];

        // then calculate the best possible ans from the last 
        for(int i = n - 2; i >= 1; i--){
            diff = Math.max(diff,prefix[i]-diff);
        }

        return diff;
    }
}