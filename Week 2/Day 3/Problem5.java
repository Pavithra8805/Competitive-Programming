// Valid Boomerang 

// Given an array points where points[i] = [xi, yi] represents a point on the X-Y plane, return true if these points are a boomerang. A boomerang is a set of three points that are all distinct and not in a straight line.

// Example 1:
// Input: points = [[1,1],[2,3],[3,2]]
// Output: true

// Example 2:
// Input: points = [[1,1],[2,2],[3,3]]
// Output: false

class Solution {
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];

        // Check if the points are collinear using the cross product method
        return (y2 - y1) * (x3 - x1) != (y3 - y1) * (x2 - x1);
    }
}
