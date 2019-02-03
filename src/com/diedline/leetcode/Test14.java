package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Test14 {
}

/**
 * ��дһ�������������ַ��������е������ǰ׺��
 *
 * ��������ڹ���ǰ׺�����ؿ��ַ��� ""��
 *
 * ʾ�� 1:
 *
 * ����: ["flower","flow","flight"]
 * ���: "fl"
 * ʾ�� 2:
 *
 * ����: ["dog","racecar","car"]
 * ���: ""
 * ����: ���벻���ڹ���ǰ׺��
 * ˵��:
 *["aac","acab","aa","abba","aa"]
 * ��������ֻ����Сд��ĸ a-z ��
 */

class Solution14 {
    @Test
    public void test() {
        String[] strs = {"ac", "ac", "a", "ac"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println("------------------------");
    }


    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        if (strs.length > 1) {
            int len = strs[0].length();
            for (int i = 0; i < len; i++) {
                char curr = strs[0].charAt(i);
                //��ȡ����һ���ַ� Ȼ�������������ֵ�Ƚ�
                for (int j = 1; j < strs.length; j++) {
                    //���������ַ����ĳ��ȱȵ�һ���ַ����ĳ���С �����ǲ�ƥ���˾ͷ���String aaa aa�������
                    if (strs[j].length() <= i || strs[j].charAt(i) != curr) {
                        return sb.toString();
                    }
                    //�����ַ�����ֵ��currȡ����ֵ��ͬ����ѭ�����������
                    if (strs[j].charAt(i) == curr && j == strs.length - 1) {
                        sb.append(curr);
                    }
                }
            }
        }
        return sb.toString();
    }
}