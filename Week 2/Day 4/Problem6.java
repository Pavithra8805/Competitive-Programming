// Keyboard Row

// Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
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

import java.util.LinkedList;
import java.util.List;
class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl;";
        String row3 = "zxcvbnm";
        List<String> list = new LinkedList<>();
        for (String word : words) {
            int[] rows = new int[3];
            for (char ch : word.toLowerCase().toCharArray()) {
                if (row1.indexOf(ch) != -1) {
                    rows[0] = 1;
                } else if (row2.indexOf(ch) != -1) {
                    rows[1] = 1;
                } else if (row3.indexOf(ch) != -1) {
                    rows[2] = 1;
                }
            }
            int sum = rows[0] + rows[1] + rows[2];
            if (sum == 1) {
                list.add(word);
            }
        }
        String[] arr = new String[list.size()];
        int i = 0;
        for (String word : list) {
            arr[i++] = word;
        }
        return arr;
    }
}