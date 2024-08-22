// Base 7

// Given an integer num, return a string of its base 7 representation.

// Example 1:
// Input: num = 100
// Output: "202"

// Example 2:
// Input: num = -7
// Output: "-10"

// Constraints:
// -107 <= num <= 107

class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        
        boolean isNegative = num < 0;
        num = Math.abs(num);
        StringBuilder base7 = new StringBuilder();
        
        while (num > 0) {
            base7.append(num % 7);
            num /= 7;
        }
        
        if (isNegative) {
            base7.append("-");
        }
        
        return base7.reverse().toString();
    }
}
