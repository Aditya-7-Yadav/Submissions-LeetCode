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
        List<Integer> al= new ArrayList<>();
        ListNode temp= head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        int ans=0;
        for(int i=0;i<al.size()/2;i++)ans=Math.max(ans,al.get(i)+al.get(al.size()-1-i));
        return ans;
    }
}