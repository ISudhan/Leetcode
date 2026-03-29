class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
                int n = map.get(i);
                int sum = (n*(n+1))/2;
                int sum_sub = ((n-1)*n)/2;
                ans += sum - sum_sub;
            }
            else map.put(i,0);
        }
        return ans;
    }
}