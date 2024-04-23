class Solution {
    int M = 1000000007;  

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        
        int[][][] dp = new int[maxMove + 1][m][n];
        
        
        for (int move = 1; move <= maxMove; move++) {
            
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    
                    long up = i - 1 < 0 ? 1 : dp[move - 1][i - 1][j];
                    long down = i + 1 >= m ? 1 : dp[move - 1][i + 1][j];
                    long left = j - 1 < 0 ? 1 : dp[move - 1][i][j - 1];
                    long right = j + 1 >= n ? 1 : dp[move - 1][i][j + 1];
                    
                    
                    dp[move][i][j] = (int)((up + down + left + right) % M);
                }
            }
        }
        
        return dp[maxMove][startRow][startColumn];
    }
}
