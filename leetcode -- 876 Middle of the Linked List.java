// https://leetcode.com/problems/middle-of-the-linked-list/submissions/

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
        ListNode midPointer = head, endPointer = head;
        
        while(endPointer != null && endPointer.next != null) {
            midPointer = midPointer.next;
            endPointer = endPointer.next.next;
        }
        
        return midPointer;
    }
}
