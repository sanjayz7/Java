class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int j=1;j<=amount;j++){
            for (int i = coins.length - 1; i >= 0; i--) {
              /*  if(amount>=coins[i]){
                    int coins_choice=coins[i];
                    int remainder=amount-coins[i];
                    int min_coins=coins_choice+dp[remainder];
                    dp[j]=min_coins;
                }
                */
                 if (j >= coins[i] && dp[j - coins[i]] != Integer.MAX_VALUE) {
                      dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                    }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}

/*
Nice twist! If you want to return how many ways 
int[] dp = new int[amount + 1];
dp[0] = 1; // Only 1 way to make 0: use nothing

for (int i = 0; i < coins.length; i++) {
    for (int j = coins[i]; j <= amount; j++) {
        dp[j] += dp[j - coins[i]];
    }
}
return dp[amount];
public static long getWays(int n, List<Long> c) {
    long[] dp = new long[n + 1];
    dp[0] = 1; // Only one way to make 0

    for (Long coin : c) {
        int coinValue = coin.intValue();
        for (int j = coinValue; j <= n; j++) {
            dp[j] += dp[j - coinValue];
        }
    }
    return dp[n];
}
*/