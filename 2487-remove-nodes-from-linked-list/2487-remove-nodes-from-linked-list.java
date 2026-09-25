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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=head;
        Stack<Integer> stack=new Stack<>();
        while(temp!=null){
            stack.push(temp.val);
            temp=temp.next;
        }
        ListNode res=new ListNode(0);
        ListNode answer=res;
        ListNode newnode;
        int max=stack.pop();
        newnode=new ListNode(max);
        res.next=newnode;
        res=res.next;
        while(!stack.isEmpty()){
            if(stack.peek()<max){
                stack.pop();
            }else{
                newnode=new ListNode(stack.peek());
                res.next=newnode;
                res=res.next;
                max=stack.peek();
                stack.pop();
            }
        }
        Stack<Integer> result=new Stack<>();
        ListNode sol=answer;
        ListNode solution=sol;
        answer=answer.next;
        while(answer!=null){
            result.add(answer.val);
            answer=answer.next;
        }
        while(!result.isEmpty()){
           newnode=new ListNode(result.pop());
           sol.next=newnode;
           sol=sol.next;
        }
        return solution.next;
    }
}