class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb=new StringBuilder();
        ListNode cur=head;
        while(cur!=null){
            sb.append(cur.val);
            cur=cur.next;
        }
        return Integer.parseInt(sb.toString(),2);
    }
}