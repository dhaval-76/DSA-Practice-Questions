// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        int y;
        int[] output = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            y = target - nums[i];
            if (temp.containsKey(y)) {
                output[0] = i;
                output[1] = temp.get(y);
                return output;
            } else temp.put(nums[i], i);
        }
        
        return output;
    }
}
