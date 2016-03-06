public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount+1];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = Integer.MAX_VALUE;
        }
        memo[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] > i) {
                    continue;
                } else {
                    if (memo[i - coins[j]] != -1 && 1 + memo[i - coins[j]] <= memo[i]) {
                        memo[i] = 1 + memo[i - coins[j]];
                    }
                }
            }
            if (memo[i] == Integer.MAX_VALUE) memo[i] = -1;
        }
        return memo[amount];
    }
}