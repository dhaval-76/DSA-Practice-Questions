// https://leetcode.com/problems/rotate-image/

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length - 1, temp1, temp2, temp3, row, col;
        
        for(int i = 0; i <= n/2 ; i++) {
            for(int j = i; j <= n - 1 - i; j++) {
                temp1 = matrix[i][j];
                row = j;
                col = n - i;
                temp2 = matrix[row][col];
                matrix[row][col] = temp1;
                
                temp3 = row;
                row = col;
                col = n - temp3;
                temp1 = matrix[row][col];
                matrix[row][col] = temp2;
                
                temp3 = row;
                row = col;
                col = n - temp3;
                temp2 = matrix[row][col];
                matrix[row][col] = temp1;
                
                temp3 = row;
                row = col;
                col = n - temp3;
                temp1 = matrix[row][col];
                matrix[row][col] = temp2;
            }
        }
    }
}
