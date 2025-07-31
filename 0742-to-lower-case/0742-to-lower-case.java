class Solution {
    public String toLowerCase(String s) {
       String newS = "";
       for(char ch:s.toCharArray()){
        if(ch<='Z' && ch>='A'){
            newS += (char)(ch+32);
        }
        else{
            newS += ch;
        }
       }
       return newS;
    }
}