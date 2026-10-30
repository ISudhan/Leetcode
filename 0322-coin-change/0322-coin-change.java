class Solution {
    public int cc(int i,int amt,int[] coins,int[][] dp){
        if(i==0){
            if(amt%coins[0] == 0){
                return amt/coins[0];
            }
            else return Integer.MAX_VALUE;
        }
        if(dp[i][amt] != -1) return dp[i][amt];
        int pick = Integer.MAX_VALUE;
        if (coins[i] <= amt) {
            int res = cc(i, amt - coins[i], coins, dp);

            if (res != Integer.MAX_VALUE) {
                pick = 1 + res;
            }
        }
        int notPick = cc(i-1,amt,coins,dp);
        return dp[i][amt]=Math.min(pick,notPick);
        
    }
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        int ans = cc(dp.length-1,amount,coins,dp);
        if(ans == Integer.MAX_VALUE) return -1;
        else return ans;
    }
}