// https://leetcode.com/problems/set-matrix-zeroes/

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isFirstRow = false;
        boolean isFirstColumn = false;
        int i, j;
        
        for(i = 0; i < matrix.length; i++) {
            for(j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    if(i == 0) isFirstRow = true;
                    if(j == 0) isFirstColumn = true;
                    
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for(j = 1; j < matrix[0].length; j++){
            if(matrix[0][j] == 0){
                for(i = 1; i < matrix.length; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        for(i = 1; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                for(j = 1; j < matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        if(isFirstColumn){
            for(i = 1; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
        
        if(isFirstRow){
            for(j = 1; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
        
    }
}
