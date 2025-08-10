class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int k = 0;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                ans[k++] = nums[i];
                i++;
            }
        }
        return ans;
    }
}