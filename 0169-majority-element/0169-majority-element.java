class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
                if(map.get(i)>(int)nums.length/2){
                    return i;
                }
            }
            else{
                map.put(i,1);
            }
        }
        return 0;
    }
}