class Solution {
    int[][] dp;
    public int coinChange(int[] coins, int amount) {
        dp = new int[coins.length+1][amount+1];
        for(int i = 0;i<dp.length;i++)
        {
            for(int j = 0;j<dp[0].length;j++)
            {
                if(i == 0)
                    dp[i][j] = Integer.MAX_VALUE - 1;
                if(j == 0)
                    dp[i][j] = 0;
                if(i == 1 && j!=0)
                {
                    if(j%coins[0] == 0)
                        dp[i][j] = j/coins[0];
                    else
                        dp[i][j] = Integer.MAX_VALUE - 1;
                }
            }
        }
        for(int i = 2;i<dp.length;i++)
        {
            for(int j = 1;j<dp[0].length;j++)
            {
                if(coins[i-1]<=j)
                    dp[i][j] = Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        if(dp[coins.length][amount] >= Integer.MAX_VALUE - 1)
            return -1;
        return dp[coins.length][amount];
    }
}