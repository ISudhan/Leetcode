class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = false, heavy = false;
        long volume = (long) length*(long) width*(long) height,v = 1000000000;
        if(length>=10000 || width>=10000 || height >= 10000){
            bulky = true;
        }
        else if(volume >= v){
            bulky = true;
        }
        if(mass >= 100){
            heavy = true;
        }
        if(heavy && bulky){
            return "Both";
        }
        else if(bulky){
            return "Bulky";
        }
        else if(heavy){
            return "Heavy";
        }
        else{
            return "Neither";
        }
    }
}