// Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        //Brute Force

        // ListNode temp=head;
        // Map<ListNode,Integer> mapp=new HashMap<>();

        // while(temp!=null){
        //     if(mapp.containsKey(temp)){
        //         return temp;
        //     }

        //     mapp.put(temp,1);
        //     temp=temp.next;
        // }
        // return null;

        //Optimal Tortoise-Hare Approach:
        
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast){
               slow=head;
               while(slow!=fast){
                   slow=slow.next;
                   fast=fast.next;
               }
               return slow;
           }
        }
        return null;
    }
}
