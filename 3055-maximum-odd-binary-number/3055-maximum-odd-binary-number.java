class Solution {
    public String maximumOddBinaryNumber(String s) {
        String maxOddBinary = "";
        int countOfOne = -1;
        for(char ch:s.toCharArray()){
            if(ch == '1'){
                countOfOne++;
            }
        }
        for(int i = 0;i<s.length()-1;i++){
            if(countOfOne>0){
                maxOddBinary +="1";
                countOfOne--;
            }
            else{
                maxOddBinary += "0";
            }
        }
        return maxOddBinary+"1";
    }
}