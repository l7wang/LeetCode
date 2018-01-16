/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = head;
        while (fast != null) {
            if (fast.next == slow) return true;
            else if (fast.next == null) return false;
            else {
                fast = fast.next.next;
                slow = slow.next;
            }
        }
        return false;
    }
}