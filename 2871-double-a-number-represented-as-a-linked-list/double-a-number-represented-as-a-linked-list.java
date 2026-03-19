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
    public ListNode doubleIt(ListNode head) {
        ListNode temp=head,prev=head;
        if(head.val>4){
            ListNode temp2=new ListNode(0,head);
            head=temp2;
            prev=head;
        }
        while(temp!=null){
            if(temp.val>4)prev.val+=1;
            temp.val=(2*temp.val)%10;
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}