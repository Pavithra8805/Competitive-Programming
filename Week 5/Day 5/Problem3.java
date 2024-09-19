// Determine Whether Matrix Can Be Obtained by Rotation

// Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

// Example 1:


// Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
// Output: true
// Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
// Example 2:


// Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
// Output: false
// Explanation: It is impossible to make mat equal to target by rotating mat.
// Example 3:


// Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
// Output: true
// Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.

// Constraints:

// n == mat.length == target.length
// n == mat[i].length == target[i].length
// 1 <= n <= 10
// mat[i][j] and target[i][j] are either 0 or 1.


class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (isSameMatrix(mat, target)) {
                return true;
            }
            mat = rotateMatrix(mat);
        }
        return false;
    }
    
    private int[][] rotateMatrix(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = mat[i][j];
            }
        }
        return rotated;
    }
    
    private boolean isSameMatrix(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
