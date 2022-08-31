class Solution {
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        while(head!=null) {
            sum = sum*2; 
            // normally we do sum*10 like in palindrome but its base 2 not base 10;
            sum = sum + head.val;
            head = head.next;
        }
        return sum;
    }
}