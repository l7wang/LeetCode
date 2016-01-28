/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int carry = 0;
        ListNode* fakeHead = new ListNode(0);
        ListNode* temp = fakeHead;
        int val;
        
        while (l1 != NULL || l2 != NULL) {
            val = 0;
            if (l1) val = val + l1->val;
            if (l2) val = val + l2->val;
            val = val + carry;
            carry = val / 10;
            val = val % 10;
            temp->next = new ListNode(val);
            temp = temp->next;
            if (l1) l1 = l1->next;
            if (l2) l2 = l2->next;
        }
        
        if (carry) temp->next = new ListNode(1);
        return fakeHead->next;
    }
};