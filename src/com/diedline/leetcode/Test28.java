package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

public class Test28 {
}





/**
 * ʵ�� strStr() ������
 *
 * ����һ�� haystack �ַ�����һ�� needle �ַ������� haystack �ַ������ҳ� needle �ַ������ֵĵ�һ��λ�� (��0��ʼ)����������ڣ��򷵻�  -1��
 *
 * ʾ�� 1:
 *
 * ����: haystack = "hello", needle = "ll"
 * ���: 2
 * ʾ�� 2:
 *
 * ����: haystack = "aaaaa", needle = "bba"
 * ���: -1
 * ˵��:
 *
 * �� needle �ǿ��ַ���ʱ������Ӧ������ʲôֵ�أ�����һ���������кܺõ����⡣
 *
 * ���ڱ�����ԣ��� needle �ǿ��ַ���ʱ����Ӧ������ 0 ������C���Ե� strstr() �Լ� Java�� indexOf() ���������
 * */
class Solution28 {
    @Test
    public void test28(){
        System.out.println(strStr("","bba"));
    }

    public int strStr(String haystack, String needle) {
        if(needle == null || needle.equals("")) return 0;
        else return haystack.indexOf(needle);
    }
}