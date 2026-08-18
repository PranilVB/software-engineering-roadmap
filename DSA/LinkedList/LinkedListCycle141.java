/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode F=head;
        ListNode S=head;
         
        while(F!=null&&F.next!=null){
            F=F.next.next;
            S=S.next;
            if(F==S){
                return true;
            }
        }
        return false;
        }
    }
