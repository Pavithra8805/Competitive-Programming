//Problem - 3 : 4-SUM

//Question

// Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.

//Approach : HASH MAP

//T.C : O(n) -> This approch proccess each elemnt through array exactly once 
//S.C : O(n) -> s is created to store all elements

//Solution

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class problem3 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> l = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int a = 0; a < n; a++) {
            int b = a + 1;
            int c = b + 1;
            int d = n - 1;
            while (b < d && b < c) {
                while (c < d) {
                    long sum = (long) nums[a] + nums[b] + nums[c] + nums[d];
                    if (sum == target) {
                        s.add(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                        c++;
                        d--;
                    } else if (sum < target)
                        c++;
                    else
                        d--;

                }
                b++;
                c = b + 1;
                d = n - 1;
            }

        }
        l.addAll(s);
        return l;

    }
}