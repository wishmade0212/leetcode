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
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&& fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
        }
        while(slow!=null){
            ListNode current=slow.next;
            slow.next=prev;
            prev=slow;
            slow=current;
        }
        while(head!=null && prev!=null){
            if(head.val!=prev.val){
                 return false;
            }
            head=head.next;
            prev=prev.next;
        }
        return true;
    }
}