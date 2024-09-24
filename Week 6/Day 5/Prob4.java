// Maximum Depth of Binary tree

// Given the root of a binary tree, return its maximum depth.

// A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

// Example 1:


// Input: root = [3,9,20,null,null,15,7]
// Output: 3
// Example 2:

// Input: root = [1,null,2]
// Output: 2

// Constraints:

// The number of nodes in the tree is in the range [0, 104].
// -100 <= Node.val <= 100
public class Prob4 {
    int val;
    Prob4 left;
    Prob4 right;

    Prob4() {
    }

    Prob4(int val) {
        this.val = val;
    }

    Prob4(int val, Prob4 left, Prob4 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int maxDepth(Prob4 root) {
        if (root == null) return 0;

        // Calculate the depth by taking the maximum of left and right subtree depths
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
