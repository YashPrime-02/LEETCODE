class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head), prev = dummy, cur = head, next = head.next;
        int idx = 1;
        while (idx < right) {
            if (idx < left) {
                prev = prev.next;
                cur = cur.next;
                next = next.next;
            }
            else {
                ListNode temp = next.next;
                next.next = cur;
                cur = next;
                next = temp;
            }    
            idx++;
        }
        
        prev.next.next = next;
        prev.next = cur;
        
        return dummy.next;
    }
}