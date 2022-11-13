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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
            return null;
        ListNode f=head,s=head,r=head;
        for(int i=1;i<n;i++){
            f=f.next;
        }
        while(f.next!=null){
            r=s;
            s=s.next;
            f=f.next;
        }
        if(s==head) head=head.next;
        r.next=s.next;
        return head;
    }
}
