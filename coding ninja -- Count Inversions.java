// https://www.codingninjas.com/codestudio/problems/615

import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        long[] temp = new long[n]; 
        long count = mergeSort(arr, temp, 0, n-1);
        return count;
    }
    
    static long mergeSort(long[] arr, long[] temp, int left, int right) {
        long invCount = 0;
        int mid;
        
        if (left < right) {
            mid = (left + right)/2;
            
            invCount += mergeSort(arr, temp, left, mid);
            invCount += mergeSort(arr, temp, mid + 1, right);
            
            invCount += merge(arr, temp, left, mid + 1, right);
        }
        
        return invCount;
    }
    
    static long merge(long[] arr, long[] temp, int left, int mid, int right) {
        long invCount = 0;
        int i = left, j = mid, k = left;
        
        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += mid - i;
            }
        }
        while (i <= mid - 1) 
            temp[k++] = arr[i++];
        while (j <= right)
            temp[k++] = arr[j++];
        for (i = left; i < k; i++)
            arr[i] = temp[i];
        
        return invCount;
    }
}
