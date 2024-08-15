//Problem - 6: Minimum Size Subarray Sum

//Question

// Given an array of positive integers nums and a positive integer target, return the minimal length of a 
// subarray
//  whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

// Time complexity:O(n) // n is the length of nums
// Space complexity:O(1)

//Solution

class problem6 {
    public int minSubArrayLen(int target, int[] nums) {
    int n = nums.length;
    int minLength = Integer.MAX_VALUE;
    int sum =0;
    int left = 0;
    for(int right = 0;right < n;right++){
        sum += nums[right];
        while( sum >= target){
            minLength = Math.min(minLength ,right -left+1 );
            sum -= nums[left];
            left++;
        }
    }
    return minLength == Integer.MAX_VALUE ? 0 : minLength;

    }
}