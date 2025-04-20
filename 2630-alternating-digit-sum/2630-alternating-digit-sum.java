class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0,num = n,length=0;
        while(num!=0){
            length++;
            num /=10;
        }
        while(n!=0){
            if(length%2==0){
                sum += -1*(n%10);
                n /=10;
                length--;
            }
            else{
                sum += n%10;
                n /=10;
                length--;
            }
        }
        return sum;
    }
}