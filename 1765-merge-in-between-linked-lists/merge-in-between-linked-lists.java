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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int n=1;
        ListNode temp=list1;
        while(n++!=a)temp=temp.next;
        ListNode fin=temp.next;
        while(n++<=b)fin=fin.next;
        temp.next=list2;
        while(list2.next!=null){
            list2=list2.next;
        }
        list2.next=fin.next;
        return list1;
    }
}