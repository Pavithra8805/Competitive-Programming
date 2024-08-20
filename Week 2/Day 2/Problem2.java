// Find Lucky Integer in an Array

// Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value. Return the largest lucky integer in the array. If there is no lucky integer return -1.

// Example 1:
// Input: arr = [2,2,3,4]
// Output: 2
// Explanation: The only lucky number in the array is 2 because frequency[2] == 2.


class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        int[] freq=new int[n+1];
        for(int num:arr){
            if(num>=1 && num<=n){
                freq[num]++;
            }
        }
        int max=-1;
        for(int i=1;i<=n;i++){
            if(freq[i]==i){
                max=Math.max(max,i);
            }
        }
        return max;
        
    }
}