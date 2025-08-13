class Solution {
    public boolean isPalindrome(String s) {
        String s1 = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i)<='9'){
                s1 += (char)(s.charAt(i))+"";
            }
            else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                s1 += (char)(s.charAt(i)+32)+"";
            }
        }
        System.out.println(s1);
        if(s1.length() == 0)
        return true;
        for(int i=0;i<=s1.length()/2;i++){
            if(s1.charAt(i) != s1.charAt(s1.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}