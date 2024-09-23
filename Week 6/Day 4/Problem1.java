// Middle of the Linked List

// Given the head of a singly linked list, return the middle node of the linked
// list.

// If there are two middle nodes, return the second middle node.

// Example 1:

// Input: head = [1,2,3,4,5]
// Output: [3,4,5]
// Explanation: The middle node of the list is node 3.
// Example 2:

// Input: head = [1,2,3,4,5,6]
// Output: [4,5,6]
// Explanation: Since the list has two middle nodes with values 3 and 4, we
// return the second one.

// Constraints:

// The number of nodes in the list is in the range [1, 100].
// 1 <= Node.val <= 100

//  * Definition for singly-linked list.

// Define the ListNode class separately
class ListNode {
    int val;
    ListNode next;

    // Default constructor
    ListNode() {
    }

    // Constructor with value
    ListNode(int val) {
        this.val = val;
    }

    // Constructor with value and next node
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

// The main Solution class
class Solution {
    public ListNode middleNode(ListNode head) {
        // Use two pointers to find the middle node
        ListNode slow = head;
        ListNode fast = head;

        // Move fast pointer two steps and slow pointer one step until fast reaches the end
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // The slow pointer will be at the middle node
        return slow;
    }
}
