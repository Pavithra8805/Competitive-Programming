// Detect Capital 

// We define the usage of capitals in a word to be right when one of the following cases holds:

// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.

// Example 1:

// Input: word = "USA"
// Output: true
// Example 2:

// Input: word = "FlaG"
// Output: false

// Constraints:

// 1 <= word.length <= 100
// word consists of lowercase and uppercase English letters.

class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        boolean a = false;
        if(Character.isUpperCase(word.charAt(0))){
            if(n>1 && Character.isUpperCase(word.charAt(1))){
                a=true;
            }
        }
        for(int i=1;i<n;i++){
            if(a==false){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
            else{
                if(Character.isLowerCase(word.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
}