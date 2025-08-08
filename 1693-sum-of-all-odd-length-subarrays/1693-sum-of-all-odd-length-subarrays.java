class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for(int i = 1;i<=n;i = i+2){
            System.out.println(i);
            for(int j = 0;j<n;j++){
                if(j+i>n)
                break;
                int s = 0;
                while(s<i){
                    sum += arr[j+s];
                    s++;
                }
            }
        }
        return sum;
    }
}