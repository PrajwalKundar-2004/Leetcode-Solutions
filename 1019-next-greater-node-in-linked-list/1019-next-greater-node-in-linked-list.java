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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            stack.push(temp.val);
            temp=temp.next;
        }
        int n=stack.size();
        int[] res=new int[n];
        for(int i=n-1;i>=0;i--){
            res[i]=stack.pop();
        }
        Stack<Integer> check=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!check.isEmpty() && check.peek() <= res[i]){
                check.pop();
            }
            if(!check.isEmpty()){
                int val=check.peek();
                check.push(res[i]);
                res[i]=val;
            }else{
                check.push(res[i]);
                res[i]=0;
            }
            
        }
        return res;
    }
}