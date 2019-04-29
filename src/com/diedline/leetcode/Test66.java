package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Test66 {
}

/**
 * ����һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��
 *
 * ���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�
 *
 * ����Լ���������� 0 ֮�⣬��������������㿪ͷ��
 *
 * ʾ�� 1:
 *
 * ����: [1,2,3]
 * ���: [1,2,4]
 * ����: ���������ʾ���� 123��
 * ʾ�� 2:
 *
 * ����: [4,3,2,1]
 * ���: [4,3,2,2]
 * ����: ���������ʾ���� 4321��
 * */
class Solution66 {
    @Test
    public void test(){
        int[] digits = {9};
        int[] arr = plusOne(digits);
        for (Integer num:arr
             ) {
            System.out.println(num);
        }
    }

    /**
     *
     *
     * */
    public int[] plusOne(int[] digits) {

        int carry = 0;
        digits[digits.length-1]+=1;

        for(int i=digits.length-1; i>=0;i--){
            int number = carry + digits[i];
            digits[i] = number % 10;
            carry = number /10;
            if(i==0&&carry>0){
                int[] result = new int[digits.length+1];
                for(int j=1;j<result.length;j++){
                    result[j] = digits[j-1];
                }
                result [0] = carry;
                return result;
            }
        }

        return digits;
    }
}
