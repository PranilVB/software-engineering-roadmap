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
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int size = 0;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            size++;
        }
        size++;

        k = k % size;

        if (k == 0) {
            return head;
        }

        int steps = size - k;

        tail = head;

        for (int i = 1; i < steps; i++) {
            tail = tail.next;
        }

        ListNode newHead = tail.next;

        tail.next = null;

        ListNode oldTail = newHead;

        while (oldTail.next != null) {
            oldTail = oldTail.next;
        }

        oldTail.next = head;

        return newHead;
    }
}