class Solution {
    public long memo(int n, int[] c, long[] dp) {
        if (n <= 0) return 0;

        if (dp[n] != -1) return dp[n];

        long l1 = Long.MAX_VALUE;
        long l2 = Long.MAX_VALUE;
        long l3 = Long.MAX_VALUE;

        l1 = memo(n - 1, c, dp) + c[n - 1] + 1;
        l2 = (n >= 2)
             ? memo(n - 2, c, dp) + c[n - 1] + 4
             : Long.MAX_VALUE;
        l3 = (n >= 3)
             ? memo(n - 3, c, dp) + c[n - 1] + 9
             : Long.MAX_VALUE;

        return dp[n] = Math.min(l1, Math.min(l2, l3));
    }

    public int climbStairs(int n, int[] costs) {
        long[] dp = new long[n + 1];
        java.util.Arrays.fill(dp, -1);

        return (int) memo(n, costs, dp);
    }
}