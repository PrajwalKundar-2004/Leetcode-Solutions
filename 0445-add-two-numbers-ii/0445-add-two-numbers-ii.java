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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=l1;
        ListNode head2=l2;
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        while(head1!=null){
            stack1.push(head1.val);
            head1=head1.next;
        }
        while(head2!=null){
            stack2.push(head2.val);
            head2=head2.next;
        }
        ListNode res=new ListNode(0);
        ListNode combined=res;
        int ans=0;
        ListNode newnode;
        while(!(stack1.isEmpty()) && !(stack2.isEmpty())){
            ans+=stack1.pop()+stack2.pop();
            if(ans>9){
                newnode=new ListNode(ans%10);
                ans=ans/10;
            }else{
                newnode=new ListNode(ans);
                ans=0;
            }
            res.next=newnode;
            res=res.next;
        }
        while(!(stack1.isEmpty())){
            ans+=stack1.pop();
            if(ans>9){
                newnode=new ListNode(ans%10);
                ans=ans/10;
            }else{
                newnode=new ListNode(ans);
                ans=0;
            }
            res.next=newnode;
            res=res.next;
        }
        while(!(stack2.isEmpty())){
            ans+=stack2.pop();
            if(ans>9){
                newnode=new ListNode(ans%10);
                ans=ans/10;
            }else{
                newnode=new ListNode(ans);
                ans=0;
            }
            res.next=newnode;
            res=res.next;
        }
        if(ans!=0){
            newnode=new ListNode(ans);
            res.next=newnode;
            res=res.next;
        }
        Stack<Integer> stack3=new Stack<>();
        ListNode merged=combined;
        while(combined!=null){
            stack3.push(combined.val);
            combined=combined.next;
        }
        ListNode answer=merged;
        while(stack3.size()>1){
            newnode=new ListNode(stack3.pop());
            merged.next=newnode;
            merged=merged.next;
        }
        merged.next=null;
        return answer.next;

    }
}