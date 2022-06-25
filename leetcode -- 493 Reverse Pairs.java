// https://leetcode.com/problems/reverse-pairs/

class Solution {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int count = mergeSort(nums, temp, 0, n-1);
        return count;
    }
    
    static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int invCount = 0;
        int mid;

        if (left < right) {
            mid = (left + right)/2;

            invCount += mergeSort(arr, temp, left, mid);
            invCount += mergeSort(arr, temp, mid + 1, right);

            invCount += merge(arr, temp, left, mid + 1, right);
        }

        return invCount;
    }

    static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int invCount = 0;
        int i = left, j = mid, k = left;

        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while (i <= mid - 1) 
            temp[k++] = arr[i++];
        while (j <= right)
            temp[k++] = arr[j++];
        
        j = mid;
        for (i = left; i <= mid - 1; i++) {
            while (j <= right && arr[i] > (2 * (long) arr[j])) {
                j++;
            }
            invCount += (j - mid);
        }
        
        for (i = left; i < k; i++)
            arr[i] = temp[i];

        return invCount;
    }
}
