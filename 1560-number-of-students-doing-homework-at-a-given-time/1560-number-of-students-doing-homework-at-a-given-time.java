class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int noStu = 0;
        for(int i = 0;i<startTime.length;i++){
            if(endTime[i]>= queryTime && startTime[i] <= queryTime){
                noStu++;
            }
        }
        return noStu;
    }
}