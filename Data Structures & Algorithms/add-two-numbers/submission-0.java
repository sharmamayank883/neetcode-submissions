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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        int rem = 0;

        ListNode sol = new ListNode((l1.val + l2.val + rem)%10);
        rem = (l1.val + l2.val + rem)/10;
        ListNode solHead = sol;

        while(l1.next != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
            sol.next = new ListNode((l1.val + l2.val + rem)%10);
            rem = (l1.val + l2.val + rem)/10;
            sol = sol.next;
        }

        while(l1.next != null) {
            l1 = l1.next;
            sol.next = new ListNode((l1.val + rem)%10);
            rem = (l1.val + rem)/10;
            sol = sol.next;
        }

        while(l2.next != null) {
            l2 = l2.next;
            sol.next = new ListNode((l2.val + rem)%10);
            rem = (l2.val + rem)/10;
            sol = sol.next;
        }

        if(rem != 0) {
            sol.next = new ListNode(rem);
        }

        return solHead;
        
    }
}
