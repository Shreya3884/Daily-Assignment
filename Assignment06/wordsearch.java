class Solution {
    public boolean exist(char[][] grid, String target) {
        int n = grid.length, m = grid[0].length;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (dfs(grid, target, r, c, 0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] grid, String target, int r, int c, int idx) {
        if (idx == target.length()) return true;
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] != target.charAt(idx)) return false;
        char hold = grid[r][c];
        grid[r][c] = '*';
        boolean found = dfs(grid, target, r + 1, c, idx + 1) ||
                        dfs(grid, target, r - 1, c, idx + 1) ||
                        dfs(grid, target, r, c + 1, idx + 1) ||
                        dfs(grid, target, r, c - 1, idx + 1);
        grid[r][c] = hold;
        return found;
    }
}
