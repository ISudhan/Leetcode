class Solution {
    public int missingNumber(int[] nums) {
        int[] narr = new int[nums.length+1];
        int c = 0;
        for(int i:nums){
            narr[i] = 1;
        }
        for(int i = 0;i<nums.length+1;i++){
            if(narr[i] == 0){
                return i;
            }
        }
        return 0;




    }
}