package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

public class Test9 {
}
/**
 * �ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
 *
 * ʾ�� 1:
 *
 * ����: 121
 * ���: true
 * ʾ�� 2:
 *
 * ����: -121
 * ���: false
 * ����: �������Ҷ�, Ϊ -121 �� ���������, Ϊ 121- �����������һ����������
 * ʾ�� 3:
 *
 * ����: 10
 * ���: false
 * ����: ���������, Ϊ 01 �����������һ����������
 */
class Solution9 {
    @Test
    public void test(){
        System.out.println(isPalindrome(-121));
    }

    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        char[] arr = s.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            while (arr[i] != arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }
}