class Solution {
    public int compareVersion(String v1, String v2) {
        int i = 0,j = 0;
        while(v1.length()>i || v2.length()>j){
            int n1 = 0,n2 = 0;
            while(i<v1.length() && v1.charAt(i) != '.'){ 
                n1=n1*10+((int)v1.charAt(i++)-'0');
                System.out.println(n1);
            }
            while(v2.length()>j && v2.charAt(j) != '.') n2=n2*10+((int)v2.charAt(j++)-'0');

            if(n1>n2) return 1;
            if(n2>n1) return -1;
            i++;
            j++;
        }
        return 0;
    }
}