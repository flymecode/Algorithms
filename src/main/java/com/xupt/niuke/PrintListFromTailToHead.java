package com.xupt.niuke;


import java.util.ArrayList;

/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class PrintListFromTailToHead {

    private ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode == null) {
            return res;
        }
        if(listNode.next != null) {
            printListFromTailToHead(listNode.next);
        }
        res.add(listNode.val);
        return res;
    }
}
