package com.xupt.leetcode;

/**
 * @author maxu
 * @date 2019/5/1
 */
public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        ListNode odd = cur.next;
        while (cur.next != null || odd.next != null) {
            cur.next = odd.next;
            cur = cur.next;
            odd.next = cur.next;
            odd = cur.next;
        }
        cur.next = odd;
        return head;
    }
}
