/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode oddTemp = head, evenTemp = oddTemp.next, evenHead = evenTemp;
        while (evenTemp != null && evenTemp.next != null) {
            oddTemp.next = evenTemp.next;
            evenTemp.next = evenTemp.next.next;
            oddTemp = oddTemp.next;
            evenTemp = evenTemp.next;
        }
        oddTemp.next = evenHead;
        return head;
    }
}