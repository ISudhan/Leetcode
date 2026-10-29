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
        if(nums.length == 1) return nums[0];
        int dp1[] = new int[nums.length-1];
        Arrays.fill(dp1,-1);
        int dp2[] = new int[nums.length-1];
        Arrays.fill(dp2,-1);
        int[] nums1 = new int[nums.length-1];
        int[] nums2 = new int[nums.length-1];
        for(int i = 0;i<nums.length-1;i++){
            nums1[i] = nums[i];
            // System.out.print(nums[i]+" ");
        }
        // System.out.println();
        for(int i = 1;i<nums.length;i++){
            nums2[i-1] = nums[i];
            // System.out.print(nums[i]+" ");
        }
        // System.out.println();
        return Math.max(hb(nums1.length-1,dp1,nums1),hb(nums2.length-1,dp2,nums2));
    }
}