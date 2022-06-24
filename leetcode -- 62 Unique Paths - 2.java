// https://leetcode.com/problems/unique-paths/

class Solution {
    public int uniquePaths(int m, int n) {
        int N = n + m -2;
        int r = m - 1;
        double output = 1;
        
        for (int i = 1; i <= r; i++) {
            output = output * (N - r + i) / i;
        }
        
        return (int)output;
    }
}
