/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // ListNode first=headA;
        // ListNode second=headB;
        // while(first!=null){
        //     second=headB;
        //     while(second!=null){
        //         if(first==second){
        //             return first;
        //         }
        //         second=second.next;
        //     }
        //     first=first.next;
        // }
        // return null;

        // better appraoch by allowing equal number of scans
        ListNode first = headA;
        ListNode second = headB;
        while(first != second) {
            if(first == null)
                first = headB;
            else
                first = first.next;

            if(second == null)
                second = headA;
            else
                second = second.next;
            }
            return first;
            }
    }
