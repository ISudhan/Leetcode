class Solution {
    public boolean canAliceWin(int[] nums) {
        int ssum = 0,tsum = 0;
        for(int i:nums){
            if(i>9){
                tsum += i;
            }
            else{
                ssum += i;
            }
        }
        if(tsum == ssum){
            return false;
        }
        return true;
    }
}