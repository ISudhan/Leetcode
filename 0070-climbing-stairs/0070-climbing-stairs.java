class Solution {
    public int memo(int n,int[] dp){
        if(n<=2){
            return dp[n]=n;
        }
        if(dp[n] != 0) return dp[n];
        return dp[n]=memo(n-1,dp)+memo(n-2,dp);

    }
    public int climbStairs(int n) {
        int a[] = new int[n+1];
        return memo(n,a);
    }
}