class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = null;
        ListNode largeHead = null;
        ListNode small = null;
        ListNode large = null;
        
        while( head != null) {
            
            if( head.val < x) {
                if(small == null) {
                    small = head;
                    smallHead = small;
                }
                else {
                    small.next = head;
                    small = small.next;
                }
            }
            else{
                if(large == null) {
                    large = head;
                    largeHead = large;
                }
                else {
                    large.next = head;
                    large = large.next;
                }
            }
            
            head = head.next;
        }
        
        if( small != null) small.next = null;
        if( large != null) large.next = null;
        
        if( small != null ) {
            small.next = largeHead;
            return smallHead;
        }
        else return largeHead;
    }
}