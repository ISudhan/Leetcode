class Solution {
    public int ul(int i,int j,int[][] dp){
        if(i==0 && j == 0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int up = ul(i-1,j,dp);
        int left = ul(i,j-1,dp);
        return dp[i][j]=up+left;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return ul(m-1,n-1,dp);
    }
}