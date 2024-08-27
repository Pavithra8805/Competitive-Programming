// Reverse Words in a String III 

// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

// Example 1:
// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"

// Example 2:
// Input: s = "Mr Ding"
// Output: "rM gniD"


class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            sb.append(reversedWord).append(" ");
        }
        
        return sb.toString().trim();
    }
}
