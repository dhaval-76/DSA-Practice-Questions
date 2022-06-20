// https://www.codingninjas.com/codestudio/problems/873366

import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int xor = 0, setBitNo;
        int x = 0, y = 0;
        int[] output = {-1, -1};
        
        for (Integer num: arr) {
            xor ^= num;
        }
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }
        
        setBitNo = xor & ~(xor - 1);
        
        for (Integer num: arr) {
            if ((num & setBitNo) > 0) x ^= num;
            else y ^= num;
        }
        for (int i = 1; i <= n; i++) {
            if ((i & setBitNo) > 0) x ^= i;
            else y ^= i;
        }
        
        for (Integer num: arr) {
            if (x == num) {
                output[0] = y;
                output[1] = x;
                break;
            }
            if (y == num) {
                output[0] = x;
                output[1] = y;
                break;
            }
        }
        
        return output;
    }
}
