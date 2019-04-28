package com.diedline.leetcode.stack;

import java.util.Stack;

public class Test232 {
}
/**
 * ʹ��ջʵ�ֶ��е����в�����
 *
 * push(x) -- ��һ��Ԫ�ط�����е�β����
 * pop() -- �Ӷ����ײ��Ƴ�Ԫ�ء�
 * peek() -- ���ض����ײ���Ԫ�ء�
 * empty() -- ���ض����Ƿ�Ϊ�ա�
 * ʾ��:
 *
 * MyQueue queue = new MyQueue();
 *
 * queue.push(1);
 * queue.push(2);
 * queue.peek();  // ���� 1
 * queue.pop();   // ���� 1
 * queue.empty(); // ���� false
 * */
class MyQueue {
    private Stack<Integer> stack;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        Stack<Integer> tempStack = new Stack<>();
        /** ÿ�ν�ջβ��ֵ�Ƴ��������µĶ����У�ͨ���µĶ�����pop����ʵ�ֶ��е�Ч��*/
        while (!stack.empty()){
            tempStack.push(stack.pop());
        }
        int result = tempStack.pop();
        while (!tempStack.empty()){
            stack.push(tempStack.pop());
        }
        return result;
    }

    /** Get the front element. */
    public int peek() {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.empty()){
            tempStack.push(stack.pop());
        }
        int result = tempStack.peek();
        while (!tempStack.empty()){
            stack.push(tempStack.pop());
        }
        return result;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.empty();
    }
}