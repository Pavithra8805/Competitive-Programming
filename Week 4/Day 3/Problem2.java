// Longest Increasing Subsequence

// Given an integer array nums, return the length of the longest strictly increasing subsequence.

// Example 1:

// Input: nums = [10,9,2,5,3,7,101,18]
// Output: 4
// Explanation: The longest increasing subsequence is [2,3,7,101], therefore the
// length is 4.
// Example 2:

// Input: nums = [0,1,0,3,2,3]
// Output: 4
// Example 3:

// Input: nums = [7,7,7,7,7,7,7]
// Output: 1

// Constraints:

// 1 <= nums.length <= 2500
// -104 <= nums[i] <= 104

class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        
        int[] dp = new int[nums.length];
        int maxLen = 1;
        dp[0] = 1;
        
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1; // Initialize each subsequence length to 1
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
        
        return maxLen;
    }
}
