package com.xupt.niuke;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author maxu
 * @description 输入两个链表，找出它们的第一个公共结点。
 * @date 2019-08-13
 */
public class FindFirstCommonNode {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        Set<ListNode> res = new HashSet<>();
        while (pHead1 != null) {
            res.add(pHead1);
            pHead1 = pHead1.next;
        }
        while(pHead2 != null && !res.contains(pHead2)) {
            res.add(pHead2);
            pHead2 = pHead2.next;
        }
        return pHead2;
    }
}
