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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        left--;
        right--;
        while(left<right){
            int val=list.get(left);
            list.set(left,list.get(right));
            list.set(right,val);
            left++;
            right--;
        }
        temp=head;
        int i=0;
        while(temp!=null){
            temp.val=list.get(i++);
            temp=temp.next;
        }
        return head;
    }
}