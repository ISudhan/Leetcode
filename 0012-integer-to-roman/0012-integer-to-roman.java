class Solution {
    public String intToRoman(int num) {
        String[] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String s = "";
        for(int i=0;i<val.length && num>0;i++){
            while(val[i] <= num){
                s +=symbol[i];
                num = num - val[i];
            }
        }
        return s;
    }
}