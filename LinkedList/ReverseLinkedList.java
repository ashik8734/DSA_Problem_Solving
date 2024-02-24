// Reverse LinkedList
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode priv=null;

        while(temp!=null){
            ListNode front=temp.next;
            temp.next=priv;
            priv=temp;
            temp=front;
        }
        return priv;
    }
}
