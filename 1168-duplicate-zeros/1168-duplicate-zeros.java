class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ans = new int[arr.length];
        int j = 0;
        
        for (int i = 0; i < arr.length && j < arr.length; i++) {
            if (arr[i] == 0) {
                ans[j] = 0;
                j++;
                if (j < arr.length) {
                    ans[j] = 0;
                    j++;
                }
            } else {
                ans[j] = arr[i];
                j++;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            arr[k] = ans[k];
        }
    }
}
