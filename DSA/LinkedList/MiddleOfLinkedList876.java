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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int size=1;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        size=size/2;
        temp=head;
        while(size>0){
            head=head.next;
            size--;
        }
        return head;
    }
}