package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Test5 {
}
/**
 * ����һ���ַ��� s���ҵ� s ����Ļ����Ӵ�������Լ��� s ����󳤶�Ϊ 1000��
 *
 * ʾ�� 1��
 *
 * ����: "babad"
 * ���: "bab"
 * ע��: "aba" Ҳ��һ����Ч�𰸡�
 * ʾ�� 2��
 *
 * ����: "cbbd"
 * ���: "bb"
 */
class Solution5 {
    @Test
    public void test(){
//        Index index = new Index(0,1);
//        HashMap<Integer,Index> indexMap = new HashMap<>();
//        indexMap.put(0,index);
//        System.out.println(indexMap.get(0).getA() + indexMap.get(0).getB());
        System.out.println(longestPalindrome("babad"));
        System.out.println("111111111111");
    }
    //����д��������
    int std;        //��ʼ
    int end;        //��ֹ
    public String longestPalindrome(String s){
        int len = s.length();
        //���жϳ����Ƿ�С�ڵ���1
        if(len <= 1){
            return s;
        }
        //ת���ַ�����
        char[] chars = s.toCharArray();
        for (int i = 0; i <len ; i++) {
            help(chars, i, i);
            help(chars, i, i+1);
            //01 12 23 34
        }
        //�ɹ����ػ����Ӵ�  substring �����Ӵ��ķ���
        return s.substring(std, end +1);
    }
    public void help(char[] chars,int l,int r){
        //�����ж��Ƿ����
        while (l >= 0 && r <chars.length && chars[l] == chars[r]){
            --l;
            ++r;
        }
        //����������
        if(end - std <r -l -2){
            std = l + 1;
            end = r - 1;
        }
    }

}