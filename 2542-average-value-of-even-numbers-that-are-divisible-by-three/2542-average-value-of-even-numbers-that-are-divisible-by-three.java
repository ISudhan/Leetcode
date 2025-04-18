class Solution {
    public int averageValue(int[] nums) {
        int c = 0;
        int sum = 0;
        for(int i:nums){
            if(i%2 == 0 && i%3 == 0){
                sum += i;
                c++;
            }
        }
        if(sum == 0){
            return 0;
        }
        return sum/c;
    }
}