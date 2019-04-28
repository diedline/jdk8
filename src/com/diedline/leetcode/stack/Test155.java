package com.diedline.leetcode.stack;

import java.util.Stack;

/**
 *
 * ���һ��֧�� push��pop��top �����������ڳ���ʱ���ڼ�������СԪ�ص�ջ��
 *
 * push(x) -- ��Ԫ�� x ����ջ�С�
 * pop() -- ɾ��ջ����Ԫ�ء�
 * top() -- ��ȡջ��Ԫ�ء�
 * getMin() -- ����ջ�е���СԪ�ء�
 * ʾ��:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> ���� -3.
 * minStack.pop();
 * minStack.top();      --> ���� 0.
 * minStack.getMin();   --> ���� -2.
 *
 *
 * */
public class Test155 {
    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
    private  Stack<Integer> stack;

    private Stack<Integer> minStack;
    /** initialize your data structure here. */
    public Test155() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);

        //���ջΪ�� ��������ֵС����Сջ�Ķ���ֵ
        if(minStack.empty() || x < minStack.peek()){
            minStack.push(x);
        }else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
       return minStack.peek();
    }



}
