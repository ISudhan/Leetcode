class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int a=0,b=0;
        int[] ans = new int[A.length];
        for(int i = 0;i<A.length;i++){
            set1.add(A[i]);
            set2.add(B[i]);
            if(set1.contains(B[i]) && A[i] != B[i])
            a++;
            if(set2.contains(A[i]))
            b++;
            ans[i] = a+b;
        }
        return ans;
    }
}