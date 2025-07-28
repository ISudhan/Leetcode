class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        for(int i = 0;i<index.length;i++){
            int num = nums[i];
            int ind = index[i];
            for(int j = ind;j<index.length;j++){
                int t = target[j];
                target[j] = num;
                num = t;
            } 
        }
        return target;
    }
}