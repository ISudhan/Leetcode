class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(digits[n-1] != 9){
            digits[n-1] = digits[n-1] + 1;
            return digits;
        }
        else{
            int[] narr = new int[n+1];
            int i = n,carry = 1;
            while(i>0){
                int a = digits[i-1]+carry;
                narr[i] = a%10;
                i--;
                a = a/10;
                carry = a;
            }
            if(carry != 0) narr[0] = carry;
            else return Arrays.copyOfRange(narr, 1, n+1);
            return narr;
        }
    }
}