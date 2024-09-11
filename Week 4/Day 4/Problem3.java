// 3. Word Break   

// Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

// Note that the same word in the dictionary may be reused multiple times in the segmentation.

// Solution
import java.util.*;
class problem4 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();

        // Create a set of words from the list so that the lookup cost in the set
        // becomes O(1)
        Set<String> wordSet = new HashSet<>(wordDict);

        // Initialize the lookup table
        boolean[] dp = new boolean[n + 1];

        // Set the first element to true as it represents the empty string
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}