// Find all numbers disappeared in an array (Question)

// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

// Example:
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]

import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1; 
            if (nums[index] > 0) {
                nums[index] = -nums[index]; 
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result.add(i + 1); 
            }
        }
        
        return result;
    }
}
