class Solution {
    public String reverseWords(String s) {
        String res = "";
        for(int i = s.length()-1;i>=0;i--){
            String words = "";
            if(s.charAt(i) == ' '){
                continue;
            }
            else{
                while(i>=0 && s.charAt(i) != ' '){
                    words = s.charAt(i)+words;
                    i--;
                }
                if(res != ""){
                    res += " "+words;
                }
                else{
                    res += words;
                }
            }
        }
        return res;
    }
}