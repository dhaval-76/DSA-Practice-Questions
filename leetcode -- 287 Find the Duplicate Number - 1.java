// https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
        int abs = -1;
        
        for (int i = 0; i < nums.length; i++) {
            abs = Math.abs(nums[i]);
            if (nums[abs] < 0) break;
            
            nums[abs] = -nums[abs];
        }
        
        return abs;
    }
}
