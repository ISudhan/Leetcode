import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        int j = 0;
        List<Integer> l = new ArrayList<>();
        for(int i:nums2){
            if(set.contains(i)){
                l.add(i);
                set.remove(i);
            }
        }
        return l.stream().mapToInt(Integer::intValue).toArray();    
    }
}