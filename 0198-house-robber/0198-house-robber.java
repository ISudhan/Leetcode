class Solution {
    public int hb(int ind,int[] dp,int[] nums){
        if(ind==0) return nums[0];
        if(ind<0) return 0;
        if(dp[ind] != -1) return dp[ind];
        int take = nums[ind] + hb(ind-2,dp,nums);
        int notTake = hb(ind-1,dp,nums);
        return dp[ind] = Math.max(take,notTake);
    }
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);
        return hb(nums.length-1,dp,nums);
    }
}