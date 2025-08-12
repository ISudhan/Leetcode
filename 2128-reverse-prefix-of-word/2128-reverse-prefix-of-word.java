class Solution {
    public String reversePrefix(String word, char ch) {
        int i,j=0;
        char[] c = word.toCharArray();
        for(i = 0;i<word.length();i++){
            if(word.charAt(i) == ch){
                while(j<i){
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                    i--;
                    j++; 
                }
            break;
            }
        }
        String s = new String(c);
        return s;        
    }
}