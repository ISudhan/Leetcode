class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right = 0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            if(right > k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            if(map.get(nums[right])==2){
                return true;
            }
        }
        return false;
    }
}