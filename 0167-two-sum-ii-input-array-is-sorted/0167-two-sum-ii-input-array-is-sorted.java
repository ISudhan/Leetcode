class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int left = 0,right = nums.length-1;
        while(left<right){
            int tot = nums[left] + nums[right];
            if(tot == target){
                ans[0] = left+1;
                ans[1] = right+1;
                return ans;
            }
            else if(tot > target) right--;
            else left++;
        }
        return ans;
    }
}