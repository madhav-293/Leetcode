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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode prev=new ListNode(0);
        prev.next=head;
        ListNode newHead=prev;
        while(prev.next!=null && prev.next.next!=null){
            //Declare
            ListNode node1=prev.next;
            ListNode node2=node1.next;
            ListNode nextNode=node2.next;
            //swap
            prev.next=node2;
            node2.next=node1;
            node1.next=nextNode;
            //move
            prev=node1;
        }
        return newHead.next;
    }
}
