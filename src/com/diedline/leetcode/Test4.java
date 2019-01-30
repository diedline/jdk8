package com.diedline.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test4 {
}
/**
 * ����������СΪ m �� n ���������� nums1 �� nums2��
 *
 * �����ҳ������������������λ��������Ҫ���㷨��ʱ�临�Ӷ�Ϊ O(log(m + n))��
 *
 * ����Լ��� nums1 �� nums2 ����ͬʱΪ�ա�
 *
 * ʾ�� 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * ����λ���� 2.0
 * ʾ�� 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * ����λ���� (2 + 3)/2 = 2.5
 */
class Solution2 {
    @Test
    public void test(){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
    //ͨ��
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //���ʹ��Int�ᶪʧ����
        double d1 = 0,d2 = 0;
        //�������Ƚ��ж�����
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //�������жϵ�����һ��Ϊ�յ����
        if(nums1 == null ||nums2 == null){
            if (nums1!=null){
                d1 = (double) (nums1[nums1.length /2]+nums1[nums1.length/2-1])/2;
            }else {
                d2 = (double)(nums2[nums2.length /2]+nums2[nums2.length/2-1])/2;
            }
            return nums1!=null?d1:d2;
        }
        //ʹ��IntStream������Int��������
        IntStream stream = Arrays.stream(nums1);
        IntStream stream1 = Arrays.stream(nums2);
        IntStream stream2 =  IntStream.concat(stream,stream1);
        //ֱ�ӽ�����ת�������鲢����
        int[] arr3 = stream2.toArray();
        Arrays.sort(arr3);
        //������������� ��arr3.length�ĳ���Ϊ����ʱ ֱ�ӷ���arr3.length+1/2
        //Ϊż��ʱ�ŷ��������������
        if(arr3.length%2 ==0){
            d1 = (double) (arr3[arr3.length/2]+arr3[arr3.length/2-1])/2;
            return d1;
        }else {
            d1 = (double) arr3[(arr3.length-1)/2];
            return d1;
        }
    }

}