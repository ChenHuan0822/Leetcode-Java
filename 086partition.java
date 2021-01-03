/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        // 1->4->3->2->5->2
        // 1->2->2
        // 4->3->5
        // 1->2->2->4->3->5
        ListNode first = new ListNode();
        ListNode first_cur = first;
        ListNode second = new ListNode();
        ListNode second_cur = second;
        
        ListNode cur = head;
        while(cur!=null) {
            ListNode copy = new ListNode(cur.val);
            if (cur.val<x) {
                first_cur.next = copy;
                copy.next = null;
                first_cur = copy;
            } else {
                second_cur.next = copy;
                copy.next = null;
                second_cur = copy;
            }
            cur = cur.next;
        }

        first_cur.next = second.next;
        return first.next;
    }
}