class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode temp=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        while(temp.next!=slow){
            temp=temp.next;
        }
        temp.next=slow.next;
        
        return head;
    }
}