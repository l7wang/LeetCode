/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    // First try
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }
    private ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        int val = 0;
        int newCarry = 0;
        ListNode result;
        
        if (l1 == null && l2 == null) {
            if (carry == 1) {
                return new ListNode(1);
            }
            else return null;
        }
        
        if (l1 != null) val += l1.val;
        if (l2 != null) val += l2.val;
        if (carry == 1) val++;
        
        result = new ListNode(val % 10);
        newCarry = val / 10;
        
        if (l1 != null) l1 = l1.next;
        if (l2 != null) l2 = l2.next;
        result.next = addTwoNumbers(l1, l2, newCarry);
        return result;
    }
}