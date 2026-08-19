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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        for (int i = 1; i < left; i++) {
            prev = present;
            present = present.next;
        }
        ListNode last = prev;
        ListNode newEnd = present;
        ListNode next = null;
        for (int i = 0; i < right - left + 1; i++) {
            next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = present;
        return head;
    }
}