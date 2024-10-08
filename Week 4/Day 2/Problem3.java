// Given a string containing digits from 2-9 inclusive, return all possible
// letter combinations that the number could represent. Return the answer in any
// order.

// A mapping of digits to letters (just like on the telephone buttons) is given
// below. Note that 1 does not map to any letters.

// Example 1:

// Input: digits = "23"
// Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
// Example 2:

// Input: digits = ""
// Output: []
// Example 3:

// Input: digits = "2"
// Output: ["a","b","c"]

// Constraints:

// 0 <= digits.length <= 4
// digits[i] is a digit in the range ['2', '9'].


import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        String[] digitMap = {
            "",    // 0
            "",    // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz" // 9
        };

        List<String> combinations = new ArrayList<>();
        backtrack(combinations, digitMap, digits, 0, new StringBuilder());
        return combinations;
    }

    private void backtrack(List<String> combinations, String[] digitMap, String digits, int index, StringBuilder path) {
        if (index == digits.length()) {
            combinations.add(path.toString());
            return;
        }

        String currentLetters = digitMap[digits.charAt(index) - '0'];
        for (char letter : currentLetters.toCharArray()) {
            path.append(letter);
            backtrack(combinations, digitMap, digits, index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
