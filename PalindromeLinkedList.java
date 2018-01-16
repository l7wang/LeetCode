/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        //First try
        List<Integer> ls = new ArrayList<Integer>();
        if (head == null) return true;
        while(head != null) {
            ls.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).intValue() != ls.get(ls.size() - i - 1).intValue()) return false;
        }
        return true;
    }
}