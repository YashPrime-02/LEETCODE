class Solution {
// Get the mid of the linked list
    private ListNode mid(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
	// reverse the list from the mid point 
   private ListNode reverse(ListNode root){
        ListNode prev=null;
        ListNode curr=root;
        ListNode next=curr.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode curr=mid(head);
        ListNode second=reverse(curr);
        
        while(head!=null && second!=null){
            if(head.val!=second.val){
                return false;
            }
            head=head.next;
            second=second.next;
        }
        return true;
    }
}