package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Optional;



/**
 * ����һ���ַ����������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ��ȡ�
 *
 * ʾ�� 1:
 *
 * ����: "abcabcbb"
 * ���: 3
 * ����: ��Ϊ���ظ��ַ�����Ӵ��� "abc"�������䳤��Ϊ 3��
 */
class Solution1 {

    @Test
    public void test(){
        int a = lengthOfLongestSubstring("abbcd");
        System.out.println(a);
    }

    public int lengthOfLongestSubstring(String s) {
        //��ʼ��
        int stIdx = 0, maxLen = 0;
        //����һ��int ��������ȡchar�ַ�
        int arr[] = new int[128];
        for(int i=0;i<s.length();i++){
            //������ȡ�ַ��г����ظ�������ֵ
            stIdx = Math.max(arr[s.charAt(i)],stIdx);
            //���� ��ȡ�ַ�������󳤶�
            maxLen = Math.max(maxLen, i-stIdx+1);
            //�������������ֵ
            arr[s.charAt(i)] = i+1;
        }
        return maxLen;
    }
}


