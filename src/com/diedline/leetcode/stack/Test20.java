package com.diedline.leetcode.stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class Test20 {
    /**
     * ����һ��ֻ���� '('��')'��'{'��'}'��'['��']' ���ַ������ж��ַ����Ƿ���Ч��
     *
     * ��Ч�ַ��������㣺
     *
     * �����ű�������ͬ���͵������űպϡ�
     * �����ű�������ȷ��˳��պϡ�
     * ע����ַ����ɱ���Ϊ����Ч�ַ�����
     *
     * ʾ�� 1:
     *
     * ����: "()"
     * ���: true
     * ʾ�� 2:
     *
     * ����: "()[]{}"
     * ���: true
     * ʾ�� 3:
     *
     * ����: "(]"
     * ���: false
     * ʾ�� 4:
     *
     * ����: "([)]"
     * ���: false
     * ʾ�� 5:
     *
     * ����: "{[]}"
     * ���: true
     */


    /***
     * ˼·   ʹ�ö�ջ
     * ���ж϶�ջ��size�Ƿ����0
     * ��arr�ַ���ջ
     * Ȼ�����isSym�������ж��Ƿ���ƥ��ķ��� �жϵ��������ʼ�ķ��źͽ����ķ���
     * ����ɹ�����ôɾ��ջ�еķ���ջ�����±��0��ʧ�ܵĻ�ջ�ͻ᲻ͣ������
     * ������ջ�Ĵ�СΪ0����ô�ʹ���ƥ��ɹ���
     */
    @Test
    public void test() {

    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arrs = s.toCharArray();
        for (char arr : arrs) {
            if (stack.size() == 0) {
                stack.push(arr);
            } else if (isSym(stack.peek(), arr)) {
                stack.pop();
            } else {
                stack.push(arr);
            }
        }
        return stack.size() == 0;
    }

    /**
     * �ж�����char�Ƿ��Ƕ�Ӧ�ķ���
     *
     * @param c1
     * @param c2
     * @return
     */
    public Boolean isSym(char c1, char c2) {
        return (c1 == '(' && c2 == ')' || c1 == '[' && c2 == ']' || c1 == '{' && c2 == '}');
    }

}
