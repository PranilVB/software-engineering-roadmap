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
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode mid2=reverseList(mid);
        ListNode rereveraseHead=mid2;
        while(head!=null&&mid2!=null){
            if(head.val!=mid2.val){
                return false;
            }
            head=head.next;
            mid2=mid2.next;
        }
        return true;
        
    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode node = head;
        ListNode after = head.next;
        while (node != null) {
            node.next = prev;
            prev = node;
            node = after;
            if (after != null) {
                after = after.next;
            }
        }

        head = prev;
        return head;
    }
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    }
