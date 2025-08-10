class Solution {
    public int countDigits(int num) {
        int count = 0,n=num;
        while(n>0){
            int rem = n%10;
            n /=10;
            if(num%rem ==0)
            count++;
        }
        return count;
    }
}