// Given an m x n 2D binary grid grid which represents a map of '1's (land) and
// '0's (water), return the number of islands.

// An island is surrounded by water and is formed by connecting adjacent lands
// horizontally or vertically. You may assume all four edges of the grid are all
// surrounded by water.

// Example 1:

// Input: grid = [
// ["1","1","1","1","0"],
// ["1","1","0","1","0"],
// ["1","1","0","0","0"],
// ["0","0","0","0","0"]
// ]
// Output: 1
// Example 2:

// Input: grid = [
// ["1","1","0","0","0"],
// ["1","1","0","0","0"],
// ["0","0","1","0","0"],
// ["0","0","0","1","1"]
// ]
// Output: 3

// Constraints:

// m == grid.length
// n == grid[i].length
// 1 <= m, n <= 300
// grid[i][j] is '0' or '1'.

class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int numRows = grid.length;
        int numCols = grid[0].length;
        int numIslands = 0;

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                if (grid[r][c] == '1') {
                    numIslands++;
                    dfs(grid, r, c);
                }
            }
        }

        return numIslands;
    }

    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0'; // Mark as visited
        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
        
    }
}
