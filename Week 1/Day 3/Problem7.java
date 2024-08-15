//Problem - 7: Maximum Subarray

//Question

// Given an integer array nums, find the 
// subarray
//  with the largest sum, and return its sum.

//T.C : O(n) ->  where n is the number of elements in the array.
//S.C : O(1) -> due to the constant space used for the HashMap and other variables.

//Solution

class problem7 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int total = 0;
        for (int n : nums) {
            if (total < 0) {
                total = 0;
            }
            total += n;
            res = Math.max(res, total);
        }
        return res;

    }
}