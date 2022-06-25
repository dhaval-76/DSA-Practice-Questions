// https://leetcode.com/problems/4sum/

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length - 1;
        long temp;
        List<List<Integer>> out = new ArrayList<>();

        for (int i = 0; i <= len; i++) {
            for (int j = i + 1; j <= len; j++) {
                for (int k = j + 1; k <= len; k++) {
                    temp = (long) target - (long) nums[i] - (long) nums[j] - (long) nums[k];

                    if (!binarySearch(nums, k + 1, len, temp))
                        continue;

                    out.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k], (int) temp)));

                }
            }
        }

        HashSet<List<Integer>> hset = new HashSet<>(out);

        return new ArrayList<>(hset);
    }

    static boolean binarySearch(int[] nums, int left, int right, long target) {
        int i = left, j = right;
        int mid;

        while (i <= j) {
            mid = i + (j - i) / 2;

            if (target == (long) nums[mid])
                return true;
            else if (target > (long) nums[mid])
                i = mid + 1;
            else
                j = mid - 1;
        }

        return false;
    }
}
