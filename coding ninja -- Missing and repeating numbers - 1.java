// https://www.codingninjas.com/codestudio/problems/873366

import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        long xMinusY = (n * (n+1)) / 2;
        long xPlusY = (n * (n+1) * (2*n + 1)) / 6;
        int[] output = {-1, -1};
        long missingNumber = 0l, repeating = 0l;
        
        for (Integer num: arr) {
            xMinusY -= num;
            xPlusY -= num*num;
        }
        missingNumber = (xMinusY + xPlusY/xMinusY)/2;
        repeating = missingNumber - xMinusY;
        
        output[0] = (int) missingNumber;
        output[1] = (int) repeating;
        return output;
    }
}
