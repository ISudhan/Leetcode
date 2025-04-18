class Solution {
    public int differenceOfSum(int[] nums) {
        int esum = 0,dsum = 0;
        for(int i:nums){
            esum +=i;
            while(i != 0){
                int rem = i%10;
                dsum += rem;
                i /=10;
            }
        }
        int diff = dsum-esum;
        if(diff<0){
            diff = 0-diff;
        }
        return diff;
    }
}