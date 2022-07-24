// https://leetcode.com/problems/merge-two-sorted-lists/

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1, temp2 = list2;
        ListNode out = new ListNode(0);
        ListNode out1 = out;
        
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                out1.next = temp1;
                temp1 = temp1.next;
            } else {
                out1.next = temp2;
                temp2 = temp2.next;
            }
            out1 = out1.next;
        }
        
        while (temp1 != null) {
            out1.next = temp1;
            temp1 = temp1.next;
            out1 = out1.next;
        }
        
        while (temp2 != null) {
            out1.next = temp2;
            temp2 = temp2.next;
            out1 = out1.next;
        }
        
        return out.next;
    }
}
