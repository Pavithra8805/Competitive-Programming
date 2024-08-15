//Problem - 5: Subarray Sum Equals K

//Question

// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
// A subarray is a contiguous non-empty sequence of elements within an array.

//T.C : O(n) -> This approch proccess each elemnt through array exactly once 
//S.C : O(n) -> the newly created map hashmap has same length as input array

//Solution


import java.util.HashMap;


class problem5 {
    public int subarraySum(int[] nums, int k) {
        int sum =0;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int j =0;j<nums.length;j++){
            sum += nums[j];
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}