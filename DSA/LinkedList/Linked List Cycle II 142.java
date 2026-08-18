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
    public ListNode detectCycle(ListNode head) {
                ListNode F=head;
        ListNode S=head;
        while(F!=null&&F.next!=null){
            F=F.next.next;
            S=S.next;            
            if(F==S){
                S=head;
                while(S!=F){
                    S=S.next;
                    F=F.next;
                }
                return S;
            }
        }
        return null;
    }
}