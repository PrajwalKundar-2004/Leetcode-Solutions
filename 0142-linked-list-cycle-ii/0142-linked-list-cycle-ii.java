/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode cycle=null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=fast;
                break;
            }
        }
        if(cycle==null){
            return null;
        }
        ListNode curr=head;
        while(curr!=cycle){
            curr=curr.next;
            cycle=cycle.next;
        }
        return curr;
    }
}