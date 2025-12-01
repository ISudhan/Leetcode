class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[0]-arr[1];
        for(int i = 0;i<arr.length && arr.length>i+1;i++){
            int a = arr[i]-arr[i+1];
            if(a != diff) return false;
        }
        return true;
    }
}