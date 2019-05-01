package com.xupt.leetcode;

/**
 * @author maxu
 * @date 2019/5/1
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null || fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
}
