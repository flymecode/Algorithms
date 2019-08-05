package com.xupt.niuke;

import java.util.Set;

public class ReverseList {

    public ListNode ReverseList(ListNode head) {

        if(head == null) {
            return null;
        }
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;

    }
}
