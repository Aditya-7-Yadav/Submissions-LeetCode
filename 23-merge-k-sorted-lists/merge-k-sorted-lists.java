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
    public ListNode mergeKLists(ListNode[] list) {
        PriorityQueue<ListNode> pq= new PriorityQueue<>((a, b) -> a.val - b.val);
        for(int i=0;i<list.length;i++){
            if(list[i]!=null)pq.offer(list[i]);
        }
        ListNode prev=pq.poll();
        if(prev==null)return prev;
        if(prev.next!=null)pq.offer(prev.next);
        ListNode root=prev;
        while(!pq.isEmpty()){
            ListNode temp=pq.poll();
            if(temp.next!=null)pq.offer(temp.next);
            prev.next=temp;
            prev=temp;
        }
        return root;
    }
}