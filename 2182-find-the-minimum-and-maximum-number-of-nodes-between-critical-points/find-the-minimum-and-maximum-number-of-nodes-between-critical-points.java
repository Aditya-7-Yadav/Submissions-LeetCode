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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans= new int[2];
        int z=-1,minn=999999,preev=-1,i=1,max=-1;
        ListNode prev=head,temp=head.next;
        while(temp.next!=null){
            int p=prev.val,c=temp.val,n=temp.next.val;
            if((p<c &&c>n)||(p>c && n>c)){
                if(z==-1)z=i;
                if(preev!=-1){
                    minn=Math.min(minn,i-preev);
                }
                preev=i;
                max=i-z;
            }
            i++;
            prev=temp;
            temp=temp.next;
        }
        ans[0]=minn;
        if(minn==999999)ans[0]=-1;
        ans[1]=max;
        if(max==0)ans[1]=-1;
        return ans;
    }
}