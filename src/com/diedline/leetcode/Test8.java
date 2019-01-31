package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class Test8 {
}
/**
 ������ʵ��һ�� atoi ������ʹ���ܽ��ַ���ת����������

 ���ȣ��ú����������Ҫ�������õĿ�ͷ�ո��ַ���ֱ��Ѱ�ҵ���һ���ǿո���ַ�Ϊֹ��

 ������Ѱ�ҵ��ĵ�һ���ǿ��ַ�Ϊ�����߸���ʱ���򽫸÷�����֮���澡���ܶ���������������������Ϊ�������������ţ�
 �����һ���ǿ��ַ������֣���ֱ�ӽ�����֮�������������ַ�����������γ�������

 ���ַ���������Ч����������֮��Ҳ���ܻ���ڶ�����ַ�����Щ�ַ����Ա����ԣ����Ƕ��ں�����Ӧ�����Ӱ�졣

 ע�⣺������ַ����еĵ�һ���ǿո��ַ�����һ����Ч�����ַ����ַ���Ϊ�ջ��ַ����������հ��ַ�ʱ������ĺ�������Ҫ����ת����

 ���κ�����£����������ܽ�����Ч��ת��ʱ���뷵�� 0��

 ˵����

 �������ǵĻ���ֻ�ܴ洢 32 λ��С���з�����������ô����ֵ��ΧΪ [?231,  231 ? 1]�������ֵ���������Χ��
 qing����  INT_MAX (231 ? 1) �� INT_MIN (?231) ��

 ʾ�� 1:

 ����: "42"
 ���: 42
 ʾ�� 2:

 ����: "   -42"
 ���: -42
 ����: ��һ���ǿհ��ַ�Ϊ '-', ����һ�����š�
 ���Ǿ����ܽ���������������������ֵ�����������������õ� -42 ��
 ʾ�� 3:

 ����: "4193 with words"
 ���: 4193
 ����: ת����ֹ������ '3' ����Ϊ������һ���ַ���Ϊ���֡�
 ʾ�� 4:

 ����: "words and 987"
 ���: 0
 ����: ��һ���ǿ��ַ��� 'w', �����������ֻ��������š�
 ����޷�ִ����Ч��ת����
 ʾ�� 5:

 ����: "-91283472332"
 ���: -2147483648
 ����: ���� "-91283472332" ���� 32 λ�з���������Χ��
 ��˷��� INT_MIN (?231) ��
 */
class Solution8 {
    @Test
    public void test(){
        System.out.println(myAtoi("  -44"));
//        System.out.println(Integer.MAX_VALUE);
    }

    public int myAtoi(String str) {

        //ȥ���ո���
        String s = str.trim();
        if (s.equals("")||s.equals("-")||s.equals("+")){
            return 0;
        }
        String[] arr = getNumberFromString(s);
        try {
            Integer.valueOf(arr[0]);
        }catch (NumberFormatException E){
            if (arr[0].startsWith("-")){
                return Integer.MIN_VALUE;
            }else {
                return Integer.MAX_VALUE;
            }
        }
        return Integer.valueOf(arr[0]);
    }

    public String[] getNumberFromString(String srcString){
        String[] arr = {"0"};
        if(srcString.startsWith("-")) {
            String[] a = getStrings(srcString,arr);
            a[0] = "-" + a[0];
            return a;
        }else {
            return getStrings(srcString,arr);
        }
    }

    private String[] getStrings(String srcString, String[] arr) {
        if(srcString.startsWith("+") || srcString.startsWith("-")){
            srcString = srcString.substring(1);
        }
        if (srcString.charAt(0) < 48 || srcString.charAt(0) > 57 ) return arr;
        String numberStr = "";
        String stringStr = "";
        for ( int i = 0; i < srcString.length(); i ++ ){
            if ( srcString.charAt(i) >=48 && srcString.charAt(i) <= 57 ){
                numberStr += srcString.charAt(i);
            }else{
                stringStr = srcString.substring(i); break;
            }
        }
        return new String[]{ numberStr , stringStr };
    }
}