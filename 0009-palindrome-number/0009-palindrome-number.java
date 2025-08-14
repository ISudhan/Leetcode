class Solution {
    public boolean isPalindrome(int x) {
        int reverse_x = 0, num = x;
        while (num != 0) {
            int remainder = num % 10;
            num /= 10;
            reverse_x = reverse_x * 10 + remainder;
        }
        if (x < 0) {
            return false;
        } else if (reverse_x == x) {
            return true;
        } else {
            return false;
        }
    }
}