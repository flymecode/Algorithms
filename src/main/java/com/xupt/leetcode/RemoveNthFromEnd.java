package com.xupt.leetcode;

/**
 * @author maxu
 * @date 2019/5/1
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        if (fast == null) {
            return head.next;
        }
        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
