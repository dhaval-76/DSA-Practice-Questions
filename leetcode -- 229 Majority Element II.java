// https://leetcode.com/problems/majority-element-ii/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, ele1 = 0;
        int count2 = 0, ele2 = 0;
        int gtrLen = nums.length / 3;
        List<Integer> output = new ArrayList<Integer>();
        
        for (int num: nums) {
            if (ele1 == num) 
                count1++;
            else if (ele2 == num)
                count2++;
            else if (count1 == 0) {
                ele1 = num;
                count1++;
            }
            else if (count2 == 0) {
                ele2 = num;
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        
        count1 = 0;
        count2 = 0;
        for (int num: nums) {
            if (ele1 == num) count1++;
            else if (ele2 == num) count2++;
        }
        
        if (count1 > gtrLen) output.add(ele1);
        if (count2 > gtrLen) output.add(ele2);
        return output;
    }
}
