// https://leetcode.com/problems/unique-paths/

class Solution {
    public int uniquePaths(int m, int n) {
        return countUniquePaths(0, 0, m, n);
    }
    
    static int countUniquePaths(int i,int j, int m, int n) {
        if (i == m-1 && j == n-1) return 1;
        else if ( i >= m || j >= n) return 0;
        else return countUniquePaths(i+1, j, m, n) + countUniquePaths(i, j+1, m, n);
    }
}
