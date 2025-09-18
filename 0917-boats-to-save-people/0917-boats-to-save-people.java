class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0,l=0,r=people.length-1;
        Arrays.sort(people);
        while(l<=r){
            if(people[l]+people[r]<=limit){
                count++;
                r--;
                l++;
            }
            else{
                count++;
                r--;
            }
        }
        return count;
    }
}