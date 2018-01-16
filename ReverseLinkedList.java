/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode prev = head, cur = head, next = head.next;
        prev.next = null;
        while (next != null) {
            cur = next;
            next = next.next;
            cur.next = prev;
            prev = cur;
        }
        return cur;
    }
}