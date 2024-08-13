// Single number (Question)

// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one. You must implement a solution with a linear runtime complexity and use only constant extra space.

// Example 1:
// Input: nums = [2,2,1]
// Output: 1

// Example 2:
// Input: nums = [4,1,2,1,2]
// Output: 4


class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        // XOR all elements in the array
        for (int num : nums) {
            result ^=  num; // XOR operation
        }
        // The result will be the single number
        return result;
    }
}

// Time Complexity = O(n)
//  Space Complexity = O(1)