// https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, element = 0;
        
        for (int num: nums) {
            if (count == 0) 
                element = num;
            
            if (element == num) 
                count++;
            else
                count--;
        }
        
        return element;
    }
}
