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
    public static String add(ListNode head){
        StringBuilder sb=new StringBuilder();
        ListNode temp=head;
        while(temp!=null){
            sb.insert(0,temp.val);
            temp=temp.next;
        }
        return sb.toString();
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1=add(l1);
        String s2=add(l2);
        int len1=s1.length();
        int len2=s2.length();
        int size=0;
        if(len1>len2){
            size=len1+1;
        }else{
            size=len2+1;
        }
        int[] res=new int[size];
        int j=size-1;
        int sum,rem,quotient=0;
        while(len1!=0 && len2!=0){
            int a=s1.charAt(len1-1)-'0';
            int b=s2.charAt(len2-1)-'0';
            sum=a+b+quotient;
            quotient=0;
            rem=sum%10;
            res[j]=rem;
            quotient=sum/10;
            j--;
            len1--;
            len2--;
        }
        if(len1==0){
            while(len2!=0){
                int b=s2.charAt(len2-1)-'0';
                sum=b+quotient;
                quotient=0;
                rem=sum%10;
                res[j]=rem;
                quotient=sum/10;
                j--;
                len2--;
            }
        }
        else if(len2==0){
            while(len1!=0){
                int b=s1.charAt(len1-1)-'0';
                sum=b+quotient;
                quotient=0;
                rem=sum%10;
                res[j]=rem;
                quotient=sum/10;
                j--;
                len1--;
            }
        }
        if(quotient != 0) {
             res[0] = quotient;
        }
        int check;
        if(res[0]==0){
            check=1;
        }else{
            check=0;
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for(int i = res.length-1; i >=check; i--) {
            temp.next = new ListNode(res[i]);
            temp = temp.next;
        }

        return dummy.next;
    }
}