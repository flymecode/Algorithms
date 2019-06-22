package com.xupt.leetcode;

import java.util.Stack;

/**
 * min stack
 * @author maxu
 * @date 2019/5/26
 */
public class MinStack {

    private Stack<Integer> stack = null;
    private Stack<Integer> minStack = null;

    public void push(int node) {
        if(stack == null && minStack == null) {
            stack = new Stack<>();
            minStack = new Stack<>();
            stack.push(node);
            minStack.push(node);
        } else {
            int min = minStack.peek();
            if(node <= min) {
                minStack.push(node);
            }
            stack.push(node);
        }
    }

    public void pop() {
        if(stack == null || stack.isEmpty()) {
            return;
        }
        int node = stack.pop();
        int min = minStack.peek();
        if(node == min) {
            minStack.pop();
        }
    }

    public int top() {
        if(stack == null || stack.isEmpty()) {
            return 0;
        }
        return stack.pop();
    }

    public int min() {
        if(minStack == null || minStack.isEmpty()) {
            return 0;
        }
        return minStack.peek();
    }
}
