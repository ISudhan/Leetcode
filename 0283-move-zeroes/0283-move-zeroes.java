class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0,j=1;
        int length = nums.length;
        while(j<nums.length){
            if(nums[i] != 0){
                i++;
                j++;
            }
            else if(nums[j]!=0){
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
                j = i+1;
            }
            else{
                j++;
            }

        }
    }
}