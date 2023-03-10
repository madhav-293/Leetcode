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
import java.util.Random;

class Solution {
    private ListNode head;

    public Solution(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        int count = 0;
        int result = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            // Randomly choose a node to be the result with probability 1/count
            if (new Random().nextInt(count) == 0) {
                result = current.val;
            }
            current = current.next;
        }
        return result;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */