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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null) return head;
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        k=k%count;
        if(k == 0) {
            return head;
        }
        int loop=count-k;
        curr=head;
        for(int i=1;i<loop;i++){
            curr=curr.next;
        }
        ListNode newHead=curr.next;
        ListNode result=newHead;
        curr.next=null;
        while(newHead.next!=null){
            newHead=newHead.next;
        }
        newHead.next=head;
        return result;

    }
}