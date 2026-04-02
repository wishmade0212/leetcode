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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return;

        ListNode tail = head;
        while (tail != null && tail.next != null && tail.next.next != null) {
            ListNode temp = tail;
            
            while (temp.next.next != null) {
                temp = temp.next;
            }

            ListNode last = temp.next;
            temp.next = null;
            
            last.next = tail.next;
            tail.next = last;
            
            tail = tail.next.next;
        }
    }
}
