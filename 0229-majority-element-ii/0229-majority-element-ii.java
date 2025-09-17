class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0,c2=0,num1=0,num2=1;
        for (int num : nums) {
            if (num == num1) {
                c1++;
            } else if (num == num2) {
                c2++;
            } else if (c1 == 0) {
                num1 = num;
                c1 = 1;
            } else if (c2 == 0) {
                num2 = num;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }

        int count1=0,count2=0;
        for(int i=0;i<nums.length;i++){
            if(num1==nums[i]) count1++;
            else if(num2 == nums[i]) count2++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int s = nums.length;
        if(count1>s/3) list.add(num1);
        if(count2>s/3) list.add(num2);
        return list;
    }
}