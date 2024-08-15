//Problem - 8: Maximum Product Subarray

//Question

// Given an integer array nums, find a 
// subarray
//  that has the largest product, and return the product.
// The test cases are generated so that the answer will fit in a 32-bit integer.

//T.C : O(n)
//S.C : O(n) 

//Solution

class problem8 {
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            ans = Math.max(ans, max);
        }
        return ans;
    }
}