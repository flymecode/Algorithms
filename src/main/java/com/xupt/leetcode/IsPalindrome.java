package com.xupt.leetcode;

/**
 * @author maxu
 * @date 2019/5/1
 */
public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow.next);
        while (slow != null) {
            if (head.val != slow.val) {
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }



    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head, newHead = null;
        while (p != null) {
            ListNode temp = p.next;
            p.next = newHead;
            newHead = p;
            p = temp;
        }
        return newHead;
    }

//    private ListNode reverse(ListNode head) {
//        if (head.next == null) {
//            return head;
//        }
//        ListNode newHead = reverse(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }
}
