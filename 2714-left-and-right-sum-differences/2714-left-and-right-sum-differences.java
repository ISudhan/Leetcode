class Solution {
    public int[] leftRightDifference(int[] nums) {
        if(nums.length ==1){
            return new int[] {0};
        }
        int[] lsum = new int[nums.length];
        int[] rsum = new int[nums.length];
        int l = 0;
        int r =0;
        for(int i = 0;i<nums.length;i++){
            l += nums[i];
            r += nums[nums.length-1-i];
            lsum[i] +=  l;
            rsum[nums.length-1-i] += r;
        }
        int[] ans = new int[nums.length];
        for(int i=  1;i<nums.length-1;i++){
            if(i!=0 && i+1 != nums.length) 
            ans[i] = Math.abs(lsum[i-1] - rsum[i+1]); 
             System.out.println(lsum[i-1] + " " +rsum[i+1]);
        }
        ans[0] = Math.abs(rsum[1]);
        ans[nums.length-1] = Math.abs(lsum[nums.length-1]-nums[nums.length-1]);
        return ans;
    }
}