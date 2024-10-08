// Random Note

// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise. Each letter in magazine can only be used once in ransomNote.

// Example 1:
// Input: ransomNote = "a", magazine = "b"
// Output: false

// Example 2:
// Input: ransomNote = "aa", magazine = "ab"
// Output: false

// Example 3:
// Input: ransomNote = "aa", magazine = "aab"
// Output: true

// Constraints:

// 1 <= ransomNote.length, magazine.length <= 105
// ransomNote and magazine consist of lowercase English letters.

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letterCounts = new int[26];
        
        for (char c : magazine.toCharArray()) {
            letterCounts[c - 'a']++;
        }
        
        for (char c : ransomNote.toCharArray()) {
            if (letterCounts[c - 'a'] == 0) {
                return false;  
            }
            letterCounts[c - 'a']--;  
        }
        
        return true;
    }
}
