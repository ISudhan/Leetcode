class Solution {
    public int largestAltitude(int[] gain) {
        int[] net = new int[gain.length+1];
        int max = 0;
        net[0] = 0;
        for(int i = 1;i<gain.length+1;i++){
            net[i] = net[i-1]+gain[i-1];
            max = net[i]<max?max:net[i];
        }
        return max;
    }
}