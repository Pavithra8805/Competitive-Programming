//  Guess Number Higher or Lower

// We are playing the Guess Game. The game is as follows:
// I pick a number from 1 to n. You have to guess which number I picked.
// Every time you guess wrong, I will tell you whether the number I picked is
// higher or lower than your guess.

// You call a pre-defined API int guess(int num), which returns three possible
// results:

// -1: Your guess is higher than the number I picked (i.e. num > pick).
// 1: Your guess is lower than the number I picked (i.e. num < pick).
// 0: your guess is equal to the number I picked (i.e. num == pick).
// Return the number that I picked.

// Example 1:

// Input: n = 10, pick = 6
// Output: 6
// Example 2:

// Input: n = 1, pick = 1
// Output: 1
// Example 3:

// Input: n = 2, pick = 1
// Output: 1

// Constraints:

// 1 <= n <= 231 - 1
// 1 <= pick <= n


// Superclass GuessGame (package-private)
class GuessGame {
    public int guess(int num) {
        int target = 6;  
        if (num == target) {
            return 0;
        } else if (num > target) {
            return -1;
        } else {
            return 1;
        }
    }
}

// Subclass Problem2 
public class Problem2 extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = guess(mid);  
            if (result == 0) {
                return mid;  
            } else if (result < 0) {
                right = mid - 1;  
            } else {
                left = mid + 1;  
            }
        }
        
        return -1;
    }
}
