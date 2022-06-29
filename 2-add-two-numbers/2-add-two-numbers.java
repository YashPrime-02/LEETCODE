/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode start = new ListNode(0);
        ListNode curr = start;
        int carry = 0;

        while (l1 != null || l2 != null){
            int n1 = (l1 != null) ? l1.val : 0;
            int n2 = (l2 != null) ? l2.val : 0;
            int calculated = n1 + n2 + carry;
            carry = calculated / 10;
            curr.next = new ListNode(calculated % 10);
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            }
        
        if (carry > 0){
            curr.next = new ListNode(carry);
        }
        return start.next;
        }
    }