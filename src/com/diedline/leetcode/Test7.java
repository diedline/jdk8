package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

public class Test7 {
}


/**
 * ����һ�� 32 λ���з�������������Ҫ�����������ÿλ�ϵ����ֽ��з�ת��
 * <p>
 * ʾ�� 1:
 * <p>
 * ����: 123
 * ���: 321
 * ʾ�� 2:
 * <p>
 * ����: -123
 * ���: -321
 * ʾ�� 3:
 * <p>
 * ����: 120
 * ���: 21
 * ע��:
 * <p>
 *     4294967295
 *     1534236469
 *     1234
 * �������ǵĻ���ֻ�ܴ洢���� 32 λ���з���������������ֵ��ΧΪ [?231,  231 ? 1]�������������裬�����ת�����������ô�ͷ��� 0��
 */
class Solution7 {
    @Test
    public void test() {
//        System.out.println(Integer.reverse(123));
        System.out.println(reverse(-123));
    }

    public int reverse(int x) {
        //�ȶ����ֽ��з��� ��ת���ַ����÷���
        if (x <0){
            x = -x;
            return handle2(x);
        }else {
            return handle(x);
        }

    }

    private int handle(int x) {
        String s = Integer.toString(x);
        char[] arr = s.toCharArray();
        char temp;
        //�ڽ�char����������
        if(arr.length%2 ==1){
            // 0+3+1/2
                for (int i = 0; i < arr.length/2+1 ; i++){
                    temp = arr[i];
                    arr[i] = arr[arr.length-1-i];
                    arr[arr.length-1-i] = temp;
                }
        }else {
            for (int i = 0; i < arr.length/2; i++) {
                temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }
        String s2 = new String(arr);
        try{
            Integer.valueOf(s2);
        }catch (NumberFormatException e1){
            return 0;
        }

        return Integer.valueOf(s2);
    }
    private int handle2(int x) {
        String s = Integer.toString(x);
        char[] arr = s.toCharArray();
        char temp;
        //�ڽ�char����������
        if(arr.length%2 ==1){
            // 0+3+1/2
            for (int i = 0; i < arr.length/2+1 ; i++){
                temp = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
            }
        }else {
            for (int i = 0; i < arr.length/2; i++) {
                temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }
        String s2 = new String(arr);
        try{
            Integer.valueOf(s2);
        }catch (NumberFormatException e1){
            return 0;
        }
        return -Integer.valueOf(s2);
    }
}
