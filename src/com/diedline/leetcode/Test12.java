package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

public class Test12 {
}
/**
 * �������ְ������������ַ��� I�� V�� X�� L��C��D �� M��
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
 * ����һ������������תΪ�������֡�����ȷ���� 1 �� 3999 �ķ�Χ�ڡ�
 *
 * ʾ�� 1:
 *
 * ����: 3
 * ���: "III"
 * ʾ�� 2:
 *
 * ����: 4
 * ���: "IV"
 * ʾ�� 3:
 *
 * ����: 9
 * ���: "IX"
 * ʾ�� 4:
 *
 * ����: 58
 * ���: "LVIII"
 * ����: L = 50, V = 5, III = 3.
 * ʾ�� 5:
 *
 * ����: 1994
 * ���: "MCMXCIV"
 * ����: M = 1000, CM = 900, XC = 90, IV = 4.
 */



class Solution12 {
    //900 500 400 100 90 50 40 10 9 5 4 1
    @Test
    public void test(){
        System.out.println(intToRoman(3));
    }
    public String intToRoman(int num) {
        String s = "";
        if(num >=1000){
            int th = num /1000;
            for (int i = 0; i < th; i++) {
                s += "M";
                num += -1000;
            }
        }
        if(num >=900){
            s += "CM";
            num += -900;
        }
        if(num >=500){
            s += "D";
            num += -500;
        }
        if(num >= 400){
            s += "CD";
            num += -400;
        }
        if(num >= 100){
            int th = num/100;
            for (int i = 0; i < th; i++) {
                s += "C";
                num += -100;
            }
        }
        if(num >= 90){
            s += "XC";
            num += -90;
        }
        if(num >=50){
            s += "L";
            num += -50;
        }
        if(num >=40){
            s += "XL";
            num += -40;
        }
        if (num >=10){
            int th = num /10;
            for (int i = 0; i < th; i++) {
                s += "X";
                num += -10;
            }
        }
        if(num==9){
            s += "IX";
            num += -9;
        }
        if(num >=5){
            s += "V";
            num += -5;
        }
        if(num ==4){
            s += "IV";
            num += -4;
        }
        if(num <= 3){
            int th = num;
            for (int i = 0; i <th ; i++) {
                s += "I";
                num += -1;
            }
        }

        return s;
    }
}