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
    public int pairSum(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        int left=0,right=list.size()-1;
        int max=0;
        while(left<right){
            max=Math.max(max,(list.get(left)+list.get(right)));
            left++;
            right--;
        }
        return max;
    }
}