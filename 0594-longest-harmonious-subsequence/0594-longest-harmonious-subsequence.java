class Solution {
    public int findLHS(int[] nums) {
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right = 0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            if(map.containsKey(nums[right]+1)){
                result = Math.max(result,map.get(nums[right])+map.get(nums[right]+1));
            }
            if(map.containsKey(nums[right]-1)){
                result = Math.max(result,map.get(nums[right])+map.get(nums[right]-1));
            }
            
        }
        return result;
    }
}