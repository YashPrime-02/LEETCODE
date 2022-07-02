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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        
        if(l1 == null || l2 == null) 
                return l1 != null ? l1 : l2;
        
        ListNode head = new ListNode(0);
        ListNode temp = head;
        int carry=0;
        
        while(l1!=null || l2!=null || carry!=0){
            int sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            
            
            int digit = sum%10;
           
            
            carry = sum/10;
            
            //new node
            temp.next = new ListNode(digit);
            
            temp = temp.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return head.next;
    }
}