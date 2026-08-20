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
            int size=0;
            ListNode tail=head;
            while(tail!=null){
                tail=tail.next;
                size++;
        }            
        k=k%size;

        while(k!=0){
            tail=head;
            while(tail.next!=null&&tail.next.next!=null){
                tail=tail.next;
            } 

            ListNode headN=tail.next;
            tail.next=null;
            headN.next=head;
            head=headN;
            k--;
        }
        return head;
    }
}