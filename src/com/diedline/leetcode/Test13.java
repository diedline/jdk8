package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Set;

public class Test13 {
}

/**
 * �������ְ������������ַ�: I�� V�� X�� L��C��D �� M��
 *
 * �ַ�          ��ֵ
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * ���磬 �������� 2 д�� II ����Ϊ�������е� 1��12 д�� XII ����Ϊ X + II �� 27 д��  XXVII, ��Ϊ XX + V + II ��
 *
 * ͨ������£�����������С�������ڴ�����ֵ��ұߡ���Ҳ�������������� 4 ��д�� IIII������ IV������ 1 ������ 5 ����ߣ�����ʾ�������ڴ��� 5 ��С�� 1 �õ�����ֵ 4 ��ͬ���أ����� 9 ��ʾΪ IX���������Ĺ���ֻ�������������������
 *
 * I ���Է��� V (5) �� X (10) ����ߣ�����ʾ 4 �� 9��
 * X ���Է��� L (50) �� C (100) ����ߣ�����ʾ 40 �� 90��
 * C ���Է��� D (500) �� M (1000) ����ߣ�����ʾ 400 �� 900��
 * ����һ���������֣�����ת��������������ȷ���� 1 �� 3999 �ķ�Χ�ڡ�
 *
 * ʾ�� 1:
 *
 * ����: "III"
 * ���: 3
 * ʾ�� 2:
 *
 * ����: "IV"
 * ���: 4
 * ʾ�� 3:
 *
 * ����: "IX"
 * ���: 9
 * ʾ�� 4:
 *
 * ����: "LVIII"
 * ���: 58
 * ����: L = 50, V= 5, III = 3.
 * ʾ�� 5:
 *
 * ����: "MCMXCIV"
 * ���: 1994
 * ����: M = 1000, CM = 900, XC = 90, IV = 4.
 */


class Solution13 {
    @Test
    public void test(){
        System.out.println(romanToInt("D"));
    }

    public int romanToInt(String s) {
        //�Ƚ���һ��HashMap��ӳ��ֵ
        char[] arr = s.toCharArray();
        HashMap<Character,Integer> hs = new HashMap<>();
        hs.put('I',1);
        hs.put('V',5);
        hs.put('X',10);
        hs.put('L',50);
        hs.put('C',100);
        hs.put('D',500);
        hs.put('M',1000);
        Set<Character> set = hs.keySet();
//        for (String s1: set
//             ) {
//            System.out.println(s1 + hs.get(s1));
//        }

        //��ʼ�� ����ֵ
        int num = 0;
        if(arr.length ==1){
            num = hs.get(arr[0]);
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            if(i == arr.length-2){
                num += hs.get(arr[i+1]);
            }
            if(hs.get(arr[i]) <hs.get(arr[i+1])){
                num += - hs.get(arr[i]);
            }else {
                num += hs.get(arr[i]);
            }
        }
        return num;
    }
}
