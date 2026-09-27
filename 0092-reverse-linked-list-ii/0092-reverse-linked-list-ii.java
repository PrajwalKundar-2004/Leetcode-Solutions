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
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        ListNode newnode;
        int i=0;
        while(i<list.size()){
            newnode=new ListNode(list.get(i));
            dummy.next=newnode;
            dummy=dummy.next;
            i++;
        }
        return ans.next;
    }
}