package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

public class Test58 {
}

/**
 * ����һ����������Сд��ĸ�Ϳո� ' ' ���ַ��������������һ�����ʵĳ��ȡ�
 *
 * ������������һ�����ʣ��뷵�� 0 ��
 *
 * ˵����һ��������ָ����ĸ��ɣ����������κοո���ַ�����
 *
 * ʾ��:
 *
 * ����: "Hello World"
 * ���: 5
 * */
class Solution58 {
    @Test
    public void test(){
        String s = "   a  ";
//        String[] arr = s.split(" ");
//        for (String a:arr
//             ) {
//            System.out.println(a);
//        }
        System.out.println(lengthOfLastWord(s));
    }


    public int lengthOfLastWord(String s) {
        if(s.trim().equals("") ){
            return 0;
        }
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}