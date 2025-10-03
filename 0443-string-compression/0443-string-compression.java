class Solution {
    public int compress(char[] chars) {
        int i = 0,j=1,count=0;
        while(j<chars.length){
            if(chars[i] == chars[j]){
                count++;
            }
            else{
                count++;
                if(count>1){
                    String s = ""+count;
                    char[] c = s.toCharArray();
                    for(int k = 0;k<c.length;k++){
                        chars[++i] = c[k];
                    }
                }
                chars[++i] = chars[j];
                count = 0;
            }
            System.out.println(count);
            j++;
        }
        count++;
        if(count>1){
            String s = ""+count;
            char[] c = s.toCharArray();
            for(int k = 0;k<c.length;k++){
                chars[++i] = c[k];
            }
        }
        return i+1;
    }
}