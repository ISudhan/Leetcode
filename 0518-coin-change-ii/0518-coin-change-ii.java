class Solution {
    public int cc(int i,int amt,int[] coins,int[][] dp){
        if(i==0){
            if(amt%coins[0] == 0) return 1;
            else return 0;
        }
        if(dp[i][amt] != -1) return dp[i][amt];
        int pick = 0;
        if (coins[i] <= amt) {
            pick = cc(i, amt - coins[i], coins, dp);
        }
        int notPick = cc(i-1,amt,coins,dp);
        return dp[i][amt]=pick+notPick;
        
    }
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        int ans = cc(dp.length-1,amount,coins,dp);
        // if(ans == Integer.MAX_VALUE) return -1;
        return ans;
        
    }
}