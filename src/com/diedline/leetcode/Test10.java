package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

public class Test10 {
}





/**
 * ����һ���ַ��� (s) ��һ���ַ�ģʽ (p)��ʵ��֧�� '.' �� '*' ��������ʽƥ�䡣
 *
 * '.' ƥ�����ⵥ���ַ���
 * '*' ƥ���������ǰ���Ԫ�ء�
 * ƥ��Ӧ�ø��������ַ��� (s) �������ǲ����ַ�����
 *
 * ˵��:
 *
 * s ����Ϊ�գ���ֻ������ a-z ��Сд��ĸ��
 * p ����Ϊ�գ���ֻ������ a-z ��Сд��ĸ���Լ��ַ� . �� *��
 * ʾ�� 1:
 *
 * ����:
 * s = "aa"
 * p = "a"
 * ���: false
 * ����: "a" �޷�ƥ�� "aa" �����ַ�����
 */


class Solution10 {
    @Test
    public void test(){
        System.out.println(isMatch("","."));
    }


    public boolean isMatch(String s, String p) {
//        if (s.isEmpty()){
//            return false;
//        }
//        if (p.isEmpty() ){
//            return false;
//        }
        if(s.matches(p)){
            return true;
        }else {
            return false;
        }
    }
}
