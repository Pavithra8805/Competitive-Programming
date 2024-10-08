// Valid anagram (Question)

// Given two strings s and t, return true if t is an anagram of s, and false otherwise. An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true

class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths are not equal, return false immediately
        if (s.length() != t.length()) {
            return false;
        }
    
        int[] charCount = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;  
            charCount[t.charAt(i) - 'a']--;  
        }
        
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;  
    }
}
