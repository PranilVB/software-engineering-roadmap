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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;

        while (true) {
            ListNode check = current;
            for (int i = 0; i < k; i++) {
                if (check == null) {
                    return head;
                }
                check = check.next;
            }

            ListNode last = prev;
            ListNode newEnd = current;

            for (int i = 0; i < k; i++) {
                ListNode next = current.next;

                current.next = prev;
                prev = current;
                current = next;
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            if (current == null) {
                break;
            }

            prev = newEnd;
        }

        return head;
    }
}