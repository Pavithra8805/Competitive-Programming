// Valid Perfect square 

// Given a positive integer num, return true if num is a perfect square or false
// otherwise.

// A perfect square is an integer that is the square of an integer. In other
// words, it is the product of some integer with itself.

// You must not use any built-in library function, such as sqrt.

// Example 1:

// Input: num = 16
// Output: true
// Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
// Example 2:

// Input: num = 14
// Output: false
// Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an
// integer.

// Constraints:

// 1 <= num <= 231 - 1

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        long left = 2, right = num / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long squared = mid * mid;

            if (squared == num) {
                return true;
            } else if (squared > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
