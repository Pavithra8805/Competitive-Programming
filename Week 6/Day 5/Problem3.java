// Keyboard Row


// Given an array of strings words, return the words that can be typed using
// letters of the alphabet on only one row of American keyboard like the image
// below.

// In the American keyboard:

// the first row consists of the characters "qwertyuiop",
// the second row consists of the characters "asdfghjkl", and
// the third row consists of the characters "zxcvbnm".

// Example 1:

// Input: words = ["Hello","Alaska","Dad","Peace"]
// Output: ["Alaska","Dad"]
// Example 2:

// Input: words = ["omk"]
// Output: []
// Example 3:

// Input: words = ["adsdf","sfd"]
// Output: ["adsdf","sfd"]

// Constraints:

// 1 <= words.length <= 20
// 1 <= words[i].length <= 100
// words[i] consists of English letters (both lowercase and uppercase).


import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            String lowerWord = word.toLowerCase();
            if (isInOneRow(lowerWord, row1) || isInOneRow(lowerWord, row2) || isInOneRow(lowerWord, row3)) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }
    
    private boolean isInOneRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
