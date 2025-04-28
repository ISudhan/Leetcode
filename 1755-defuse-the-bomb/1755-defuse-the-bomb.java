class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr = new int[code.length];
        int n = code.length;
        
        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                int j = i + 1;
                int r = 0;
                while (r < k) {
                    if (j >= n) {
                        j = 0; 
                    }
                    sum += code[j];
                    j++;
                    r++;
                }
                arr[i] = sum;
            }
        }
         else if (k < 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                int j = i - 1;
                int r = 0;
                while (r < -k) {
                    if (j < 0) {
                        j = n - 1; 
                    }
                    sum += code[j];
                    j--;
                    r++;
                }
                arr[i] = sum;
            }
        }
        return arr;
    }
}
