class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        int diff = Integer.MAX_VALUE, res = 0;
        for (int i = 0; i + 2 < nums.length; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum == target)
                    return target;
                if (sum > target) {
                    if (sum - target < diff) {
                        diff = sum - target;
                        res = sum;
                    }
                    right--;
                } else if (sum < target) {
                    if (target - sum < diff) {
                        diff = target - sum;
                        res = sum;
                    }
                    left++;
                }
            }
            System.out.print(res + " ");
        }
        return res;
    }
}