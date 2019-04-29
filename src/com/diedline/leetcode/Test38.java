package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

public class Test38 {
}
/**
 *
 * ����������һ���������У��������е�������˳����б������õ���һ��������ǰ�������£�
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 ������  "one 1"  ("һ��һ") , �� 11��
 * 11 ������ "two 1s" ("����һ"��, �� 21��
 * 21 ������ "one 2",  "one 1" ��"һ����" ,  "һ��һ") , �� 1211��
 *
 * ����һ�������� n��1 �� n �� 30��������������еĵ� n �
 *
 * ע�⣺����˳�򽫱�ʾΪһ���ַ�����
 *
 *
 *
 * ʾ�� 1:
 *
 * ����: 1
 * ���: "1"
 * ʾ�� 2:
 *
 * ����: 4
 * ���: "1211"
 * */
class Solution38 {
    @Test
    public void test(){
        System.out.println(countAndSay(3));
    }

    public String countAndSay(int n) {
        n = n -1;
        String a = Integer.toString(n);
        String last = "1";
        for (int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer();
            int count = 1;
            for (int j = 0; j < last.length(); j++) {
                if (last.length() == j + 1 || last.charAt(j + 1) != last.charAt(j)) {
                    sb.append("" + count + last.charAt(j));
                    count = 1;
                }else {
                    count++;
                }
            }
            last = sb.toString();
        }
        return last;
    }
}