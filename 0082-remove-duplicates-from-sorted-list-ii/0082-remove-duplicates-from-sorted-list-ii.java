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
    public ListNode deleteDuplicates(ListNode head) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // ListNode temp=head;
        // int previous;
        // while(temp!=null){
        //     map.put(temp.val,map.getOrDefault(temp.val,0)+1);
        //     temp=temp.next;
        // }
        // TreeSet<Integer> set=new TreeSet<>();
        // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //     if(entry.getValue()==1){
        //         set.add(entry.getKey());
        //     }
        // }
        // ListNode res=new ListNode(0);
        // ListNode answer=res;
        // for(int values:set){
        //     ListNode newnode=new ListNode(values);
        //     res.next=newnode;
        //     res=res.next;
        // }
        // return answer.next;
       ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                while (curr.next != null &&
                       curr.val == curr.next.val) {
                    curr = curr.next;
                }
                prev.next = curr.next;
            } 
            else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}