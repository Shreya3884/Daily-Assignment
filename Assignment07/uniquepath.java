class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int[] row : dp) Arrays.fill(row, -1);
        return helper(grid, m - 1, n - 1, dp);
    }

    private int helper(int[][] g, int i, int j, int[][] dp) {
        if (i < 0 || j < 0 || g[i][j] == 1) return 0;
        if (i == 0 && j == 0) return 1;
        if (dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = helper(g, i - 1, j, dp) + helper(g, i, j - 1, dp);
    }
}
