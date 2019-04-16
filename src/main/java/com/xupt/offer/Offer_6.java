package com.xupt.offer;

/**
 * 从头到尾打印链表
 * @author maxu
 * @date 2019/4/14
 */
public class Offer_6 {
    private class ListNode {
        int value;
        ListNode next;
    }
    // 递归实现，还可以用栈来实现
    public void printListRecursively(ListNode root) {
        if (root != null) {
            if (root.next != null) {
                printListRecursively(root.next);
            }
            System.out.println(root.value);
        }
    }

}
