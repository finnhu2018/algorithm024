package com.geek.week4;

/**
 * https://leetcode-cn.com/problems/number-of-islands/
 */
public class NumberOfIslands {
    int m =0;int n =0;
    public int numIslands(char[][] grid) {
        int count = 0;
        n = grid.length;
        if (n == 0) return 0;
        m = grid[0].length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++)
                if (grid[i][j] == '1') {
                    bfs(grid, i, j);
                    ++count;
                }
        }
        return count;
    }
    private void bfs(char[][] grid, int i, int j){
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        bfs(grid, i + 1, j);
        bfs(grid, i - 1, j);
        bfs(grid, i, j + 1);
        bfs(grid, i, j - 1);
    }
}
